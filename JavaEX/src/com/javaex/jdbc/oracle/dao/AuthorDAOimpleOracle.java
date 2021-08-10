package com.javaex.jdbc.oracle.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AuthorDAOimpleOracle implements AuthorDAO {
	// 접속 코드(커넥션)
	private Connection getConnection() throws SQLException {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String dburl = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			conn = DriverManager.getConnection(dburl, "C##BITUSER", "bituser");

		} catch (ClassNotFoundException e) {
			System.err.println("드라이버 실패");
		}
		return conn;
	}

	@Override
	public List<AuthorVO> getlist() {
		// 전체 목록 불러오기
		List<AuthorVO> list = new ArrayList<>();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			conn = getConnection();
			stmt = conn.createStatement();

			String sql = "SELECT author_id, author_name, author_desc " + " FROM author ORDER BY author_id";

			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				long authorId = rs.getLong(1);
				String name = rs.getString(2);
				String desc = rs.getString(3);
				AuthorVO vo = new AuthorVO(authorId, name, desc);
				System.out.printf("%d%S%S%n", authorId, name, desc);
				list.add(vo);
			}
		} catch (SQLException e) {
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
		return list;
	}

	@Override
	public List<AuthorVO> serch(String Keyword) {
		List<AuthorVO> list = new ArrayList<>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			conn = getConnection();
			String sql = "SELECT author_id, author_name, author_desc FROM author WHERE author_name LIKE ?";

			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "%" + Keyword + "%");
			rs = pstmt.executeQuery();
			// resultset -=> list 변환
			while (rs.next()) {
				Long id = rs.getLong(1);
				String name = rs.getString(2);
				String desc = rs.getString(3);

				AuthorVO vo = new AuthorVO(id, name, desc);
				list.add(vo);

			}
		} catch (SQLException e) {
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
		return list;
	}

	@Override
	public AuthorVO get(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insert(AuthorVO vo) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int insertCount = 0;

		try {
			conn = getConnection();
			// 실행계획
			String sql = "INSERT INTO author " + " VALUES(seq_author_id.NEXTVAL,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getAuthorName());
			pstmt.setString(2, vo.getAuthorDesc());

			insertCount = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return 1 == insertCount;

	}

	@Override
	public boolean update(AuthorVO vo) {

		Connection conn = null;
		PreparedStatement pstmt = null;
		int updatecount = 0;
		try {
			conn = getConnection();
			String sql = "UPDATE author SET author_name = ?,author_desc = ? WHERE author_id = ?";
			
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, vo.getAuthorName());
			pstmt.setString(2, vo.getAuthorDesc());
			pstmt.setLong(3, vo.getAuthorId());
			updatecount = pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return 1 == updatecount;
	}

	@Override
	public boolean delete(long id) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int deleteCount = 0;

		try {
			conn = getConnection();
			String sql = "DELETE FROM author WHERE author_id=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setLong(1, id);
			deleteCount = pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return 1 == deleteCount;
	}

}
