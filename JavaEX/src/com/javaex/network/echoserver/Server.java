package com.javaex.network.echoserver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
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

			Socket socket = serversocket.accept(); // 연결 대기

			// 접속 성공시 : 클라이언트 정보 확인
			InetSocketAddress remote = (InetSocketAddress) socket.getRemoteSocketAddress();
			System.out.println("[클라이언트가 접속되었습니다.]");
			System.out.println(remote.getAddress() + ":" + remote.getPort());

			// 클라이어트로부터 메세지 수진
			// 스트림 열기
			InputStream is = socket.getInputStream();
			// 주고 받을 데이터 text -> reader
			Reader isr = new InputStreamReader(is, "UTF-8");
			BufferedReader br = new BufferedReader(isr);

			// 클라이언트 echo back 을 하기 위한 스트림 열기
			OutputStream os = socket.getOutputStream();
			Writer osw = new OutputStreamWriter(os, "UTF-8");
			BufferedWriter bw = new BufferedWriter(osw);

			// 데이터 읽기
			String message;
			while (true) {
				message = br.readLine();
				if (message == null) {
					System.out.println("[접속 종료]");
					break;
				}
				System.out.println("클라이언트로부터 메세지 : " + message);
				System.out.println("Echo back : " + message);

				// 클라이언트로 echo back
				bw.write("ECHO] : " + message);
				bw.newLine();
				bw.flush();

			}

			// 후처리
			System.out.println("======");
			System.out.println("서버 종료");

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
