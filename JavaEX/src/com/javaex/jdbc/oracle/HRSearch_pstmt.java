package com.javaex.jdbc.oracle;

import java.sql.*;
import java.util.Scanner;

public class HRSearch_pstmt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String dburl = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String dbuser = "HR";
		String dbpass = "hr";

		System.out.print("검색어>> ");
		String keyword = sc.next();

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(dburl, dbuser, dbpass);

			// 실행계획
			String sql = "SELECT first_name||' ' ||last_name as name, email, phone_number, to_char(hire_date,'yyyy-mm-dd') hire_date"
					+ " FROM employees " + "WHERE LOWER(first_name) LIKE ? OR LOWER(last_name) LIKE ?";

			// 실행계획 준비
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "%" + keyword.toLowerCase() + "%");
			pstmt.setString(2, "%" + keyword.toLowerCase() + "%");

			rs = pstmt.executeQuery();

			while (rs.next()) {
				String empname = rs.getString("name");
				String empemail = rs.getString("email");
				String empphone = rs.getString("phone_number");
				String emphire = rs.getString("hire_date");
				System.out.printf("Name: %s	Email: %s	Phone: %s	Hire date: %s%n", empname, empemail, empphone,
						emphire);
			}

		} catch (ClassNotFoundException e) {
			System.err.println("드라이버 로드 실패");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("SQL접속실패");

		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
				sc.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
