package com.javaex.basics;
//JVM���� �������� ã�� ����
public class Types {

	public static void main(String[] args) {
		// ���� ���� & ������ Ÿ�Կ� ���õ� ������ �׽�Ʈ �� ����.
//		varEx(); // �Ʒ� ��õ� �޼��带 ����
		integerEx();
		
	}
	private static void varEx(){
		/* ������ �ĺ��� ��Ģ
		 * 1. ����, ����, $, _ ��� ����
		 * 2. ���ڷ� ������ �� ����.
		 * 3. ������ ����� �� ����.
		 * 4. ����, �޼����� ����Ģ�� : camelCase
		 */
		
		//int age; // ����, �޸𸮿� �̸��� ����.
		//age = 50;
		int age = 34; // ���� + �ʱ�ȭ
				
		// �ڹٴ� ����Ÿ�� ����̱� ������, �ٸ� Ÿ���� �����͸� ���� �� ����.
		// age = 3.14; -> error �߻�
		
		// ��ȸ :
		System.out.println("����� ���̴� "+age+"�� �Դϴ�");
		
		// �ѹ��� ���� ������ ������ ��
		int v1 = 10, v2=20, v3=30;
		// ���� ������ ������ ���� �Ҵ��ϰ��� �� ��
		v1=v2=v3 = 40;
	}
	
	// ������ ������ Ÿ��
	private static void integerEx() {
		// byte(1) < Short (2) < int(4) < long(8)
		int intVar1, intVar2; //�ΰ��� ������ ������ ����
		intVar1 = 2021; //�ʱ�ȭ
//		intVar2 = 22342122212; // out of range - ������� �ʰ�
		System.out.println(Integer.toBinaryString(intVar1));
		
		long longVar1, longVar2;
		longVar1 = 2021L;
		longVar2 = 23487123123L;
		System.out.println(longVar1);
		System.out.println(longVar2);
		
		// 2���� , 8����, 16ģ��
		int bin, oct, hex;
		bin = 0b1101;  // 2���� �տ� 0b
		oct = 072;    // 8���� �տ� 0
		hex = 0xFF;   // 16���� �տ� 0x
		
		System.out.println(bin);
		System.out.println(oct);
		System.out.println(hex);
		
		
	}
}
