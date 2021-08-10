package com.javaex.jdbc.oracle.dao;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class DAOApp {

	public static void main(String[] args) {

		listAuthors();
//		insertAuthor();
		updateauthor();
//		deleteauthor();
//		searchauthor();
		listAuthors();

	}

	private static void listAuthors() {
		AuthorDAO dao = new AuthorDAOimpleOracle();
//		List<AuthorVO> list = dao.getlist();
//		Iterator<AuthorVO> it = list.iterator();

		List<AuthorVO> list = dao.getlist();
		Iterator<AuthorVO> it = list.iterator();

		while (it.hasNext()) {
			AuthorVO vo = it.next();
			System.out.printf("%d\t%s\t%s%n", vo.getAuthorId(), vo.getAuthorName(), vo.getAuthorDesc());
		}

		System.out.println("----------------------");

	}

	private static void insertAuthor() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 >>> ");
		String name = sc.next();
		System.out.print("경력 >>> ");
		String desc = sc.next();
		AuthorVO vo = new AuthorVO(name, desc);
		AuthorDAO dao = new AuthorDAOimpleOracle();

		boolean success = dao.insert(vo);

		System.out.println("Author Insert : " + (success ? "성공" : "실패"));
	}

	private static void updateauthor() {
		Scanner sc = new Scanner(System.in);

		System.out.print("저자번호 >>> ");
		long authorid = sc.nextLong();
		System.out.print("이름 >>> ");
		String name = sc.next();
		System.out.print("경력 >>> ");
		String desc = sc.next();

		AuthorVO vo = new AuthorVO(authorid, name, desc);
		AuthorDAO dao = new AuthorDAOimpleOracle();
		boolean success = dao.update(vo);

		System.out.println("Author Update : " + (success ? "성공" : "실패"));

	}

	private static void deleteauthor() {
		Scanner sc = new Scanner(System.in);
		System.out.print("저자번호 >>> ");
		long authorid = sc.nextLong();

		AuthorDAO dao = new AuthorDAOimpleOracle();

		boolean success = dao.delete(authorid);
		System.out.println("Author delete : " + (success ? "성공" : "실패"));
		sc.close();

	}

	private static void searchauthor() {
		Scanner sc = new Scanner(System.in);
		System.out.print("검색단어 >>> ");
		String Keyword = sc.next();
		
		AuthorDAO dao = new AuthorDAOimpleOracle();
		List<AuthorVO> list = dao.serch(Keyword);
		Iterator<AuthorVO> it = list.iterator();
		
		while(it.hasNext()) {
			AuthorVO vo = it.next();
			System.out.printf("%d %s %s%n",vo.getAuthorId(),vo.getAuthorName(),vo.getAuthorDesc()	 );
		}
		sc.close();

	}

}
