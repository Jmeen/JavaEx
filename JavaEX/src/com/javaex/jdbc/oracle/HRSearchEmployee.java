package com.javaex.jdbc.oracle;
import java.sql.*;

import java.util.Scanner;

public class HRSearchEmployee {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String dburl = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String dbuser = "HR";
		String dbpass = "hr";
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		System.out.print("검색할 이름을 입력해 주세요 : ");
		String name = sc.next();

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(dburl, dbuser, dbpass);
			String sql = "SELECT first_name||' ' ||last_name as name, email, phone_number, to_char(hire_date,'yyyy-mm-dd') hire_date"
					+ " FROM employees " + "WHERE LOWER(first_name) LIKE LOWER('%" + name.toLowerCase()
					+ "%') OR LOWER(last_name) LIKE LOWER('%" + name.toLowerCase() + "%')";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				String empname = rs.getString("name");
				String empemail = rs.getString("email");
				String empphone = rs.getString("phone_number");
				String emphire = rs.getString("hire_date");
				System.out.printf("Name: %s	Email: %s	Phone: %s	Hire date: %s%n", empname, empemail, empphone,
						emphire);
			}
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로드 실패");
		} catch (SQLException e) {
			System.out.println("SQL error!");
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
