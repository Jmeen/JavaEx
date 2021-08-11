package com.javaex.network.echoserver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		// 서버 소켓
		ServerSocket serversocket = null;
		try {
			// 바인드 : 주소와 포트 연결
			serversocket = new ServerSocket();
			InetSocketAddress ip = new InetSocketAddress("192.168.0.11", 10000);

			serversocket.bind(ip);

			System.out.println("<서버 시작>");
			System.out.println("[연결을 기다립니다.]");

			while (true) {
				Socket socket = serversocket.accept(); // 연결 대기
				Thread thread = new Thread(new ServerThread(socket));

				// 쓰레드 시작
				thread.start();

				System.out.println("======");
				System.out.println("서버 종료");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				serversocket.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
