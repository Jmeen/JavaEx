package com.javaex.jdbc.oracle.dao;

import java.util.List;

public interface AuthorDAO {
	public List<AuthorVO> getlist(); // 전체 목록

	public List<AuthorVO> serch(String Keyword); // 검색 목록

	public AuthorVO get(long id); // 저자 정보 확인

	public boolean insert(AuthorVO vo); // 삽입

	public boolean update(AuthorVO vo); // 갱신

	public boolean delete(long id); // 삭제

}
