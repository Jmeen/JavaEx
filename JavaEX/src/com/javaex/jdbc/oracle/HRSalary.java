package com.javaex.jdbc.oracle;

import java.sql.*;
import java.util.Scanner;

public class HRSalary {

	public static void main(String[] args) {
//		[실습 3] 급여 검색 프로그램 작성
//		: 사용자로부터 최소 급여와 최대 급여를 입력 받아 급여가 이 범위 내에 속하는 사원
//		의 정보를 출력하는 프로그램을 작성해 봅시다
		Scanner sc = new Scanner(System.in);
		String dburl = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String dbuser = "HR";
		String dbpass = "hr";
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		System.out.print("최소 급여를 입력해 주세요 >> ");
		int minnum = sc.nextInt();
		System.out.print("최대 급여를 입력해 주세요 >> ");
		int maxnum = sc.nextInt();

		// 만약 최대값/최소값을 엉뚱하게 넣었을 경우. 서로 값을 변경한다.
		if (minnum > maxnum) {
			int temp = minnum;
			minnum = maxnum;
			maxnum = temp;
		}

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(dburl, dbuser, dbpass);

			String str = "SELECT first_name||' ' ||last_name as name, salary" + " FROM employees"
					+ " WHERE salary BETWEEN " + minnum + " and " + maxnum + " ORDER BY salary ASC";

			stmt = conn.createStatement();
			rs = stmt.executeQuery(str);

			while (rs.next()) {
				String empname = rs.getString("name");
				int empsalary = rs.getInt("salary");
				System.out.printf("%-20s %d%n", empname, empsalary);
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
