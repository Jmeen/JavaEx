package com.java.miniproject;

import java.util.List;

public interface PhoneBookDAO {
	public List<PhoneBookVO> getlist();

	public List<PhoneBookVO> search(String keyword);

	public boolean insert(PhoneBookVO vo);

	public boolean update(PhoneBookVO vo);

	public boolean delete(Long id);

}
