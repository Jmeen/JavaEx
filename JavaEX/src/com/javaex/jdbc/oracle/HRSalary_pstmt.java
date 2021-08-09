package com.javaex.jdbc.oracle;

import java.sql.*;
import java.util.Scanner;

public class HRSalary_pstmt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String dburl = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String dbuser = "HR";
		String dbpass = "hr";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		System.out.print("최소 급여를 입력해 주세요 >> ");
		int minnum = sc.nextInt();
		System.out.print("최대 급여를 입력해 주세요 >> ");
		int maxnum = sc.nextInt();

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(dburl, dbuser, dbpass);

			String str = "SELECT first_name||' ' ||last_name as name, salary" + " FROM employees"
					+ " WHERE salary BETWEEN ? and ? ORDER BY salary ASC";

			pstmt = conn.prepareStatement(str);
			pstmt.setInt(1, minnum);
			pstmt.setInt(2, maxnum);

			rs = pstmt.executeQuery();

			while (rs.next()) {
				String empname = rs.getString("name");
				int empsalary = rs.getInt("salary");
				System.out.printf("%s		%8d%n", empname, empsalary);
			}

		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로드 실패");
		} catch (SQLException e) {
			System.out.println("SQL error!");
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
