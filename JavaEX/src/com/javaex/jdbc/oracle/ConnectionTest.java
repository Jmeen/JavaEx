package com.javaex.jdbc.oracle;

import java.sql.*; // JDBC API

public class ConnectionTest {

	public static void main(String[] args) {
		// DB 접속 URL
		String dburl = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String dbuser = "C##BITUSER";
		String dbpass = "bituser";

		// 접속
		Connection conn = null;
		try {
			// 드라이버 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(dburl, dbuser, dbpass);
			System.out.println(conn);
			System.out.println("접속성공");

		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로드 실패");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 자원 정리
			try {
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}
}
