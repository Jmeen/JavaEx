package com.javaex.api.objectclass.v4;

public class LangClassTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Scoreboard s1 = new Scoreboard(new int[] { 10, 20, 30, 40 });
		System.out.println(s1);

		Scoreboard s2 = s1.getClone();
		System.out.println(s2);

		s2.getScores()[0] = 50;

		System.out.println("s1==s2?" + (s1 == s2));

		System.out.println("s1.scores == s2.scores ?" + (s1.getScores() == s2.getScores()));
		System.out.println(s1);
		System.out.println(s2);

		System.out.println();
		
		Scoreboard s3 = s1.clone();
		System.out.println("s3="+s3);
		s3.getScores()[0] = 100;
		System.out.println("s1="+s1);	
		System.out.println("s3="+s3);
		System.out.println("s1==s2 ? " + (s1 == s3));
		System.out.println("s1.scores == s3.scores ?" + (s1.getScores() == s3.getScores()));

	}

}
