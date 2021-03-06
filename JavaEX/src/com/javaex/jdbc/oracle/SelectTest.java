package com.javaex.jdbc.oracle;

import java.sql.*;

public class SelectTest {

	public static void main(String[] args) {
		String dburl = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		String dbuser = "HR";
		String dbpass = "hr";

		try {
			// 1. Driver Load
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 2. connection
			conn = DriverManager.getConnection(dburl, dbuser, dbpass);
			// 3. 질의 객체 (statement)
			stmt = conn.createStatement();
			// 4. SQL 설정
			String sql = "SELECT department_id, department_name" + " FROM departments Order By department_id";
			// 5. 실행
			rs = stmt.executeQuery(sql);
			System.out.println(rs);
			// 루프 후 출력
			while (rs.next()) { // 다음 레코드 가져오기
				int deptId = rs.getInt(1); // 컬럼 순서
				String deptName = rs.getString("department_name"); // 컬럼 이름으로 가져오기
				System.out.printf("%d:%s%n", deptId, deptName);
			}
		} catch (ClassNotFoundException e) {
			System.err.println("드라이버 로드 실패");
		} catch (SQLException e) {
			System.err.println("SQL ERROR!");
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
