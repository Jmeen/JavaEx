package com.javaex.api.objectclass.v4;

import java.util.Arrays;

public class Scoreboard implements Cloneable {
	private int scores[];

	public Scoreboard(int[] scores) {
		this.scores = scores;
	}

	// getter / setter
	public int[] getScores() {
		return scores;
	}

	public void setScores(int[] scores) {
		this.scores = scores;
	}

	@Override
	public String toString() {
		return "Scoreboard [scores=" + Arrays.toString(scores) + "]";
	}

	public Scoreboard getClone() {
		Scoreboard clone = null;
		try {
			clone = (Scoreboard) clone();
		} catch (CloneNotSupportedException e) {
			e.getStackTrace();
		}
		return clone;
	}

	// 깊은 복제의 경우 내부의 참조필드들을 새로 복제하여 새 객체로 만듬. 참조를 다시연결.
	@Override
	protected Scoreboard clone() throws CloneNotSupportedException {
		//얕은 복제 시도
		Scoreboard clone = (Scoreboard)super.clone();
		
		//내부참조 복제 시도
		clone.scores = Arrays.copyOf(scores, scores.length);
		return clone;

	}
	
	
	

}
