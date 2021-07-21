package com.javaex.basics.reftypes;

public class MainArgs {

	public static void main(String[] args) {
		
		System.out.printf("%d개의 인자가 전달 %n", args.length);
		
		for (int i=0; i< args.length; i++) {
			System.out.printf("인수 %d, %s%n",i,args[i]);
		}

	}

}
