package com.javaex.oop.summary;

public class KungfuPanda extends Panda implements KungfuSkill {

	public KungfuPanda(String name, int age) {
		super(name, age);
	}

	@Override
	public void kungfu() {
		System.out.printf("%s : 아뵤뵤뵤뵤%n", this.name);
		// TODO Auto-generated method stub

	}

}
