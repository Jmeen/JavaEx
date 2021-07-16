package com.javaex.basics;

//JVM���� �������� ã�� ����
public class Types {
	static final int SPEED_LIMIT = 100;

	public static void main(String[] args) {

		// ���� ���� & ������ Ÿ�Կ� ���õ� ������ �׽�Ʈ �� ����.
//		varEx(); // �Ʒ� ��õ� �޼��带 ����
//		integerEx();
//		floatDoubleEx();
//		booleanEx();
//		charEx();
//		constantEx();
//		promotionEx();
		castingEx();
	}

	// ����� ����ȯ (casting : explicit casting)
	private static void castingEx() {
		// ǥ�� ������ ���� �ڷ��� -> ���� �ڷ��������� ��ȯ
		// ������ Ÿ�� ��ȯ�� �����ؾ���. �ڷ��� ������ �Ͼ �� ����.
		float f = 1234567890.123456789f; // 4����Ʈ �Ǽ���
		System.out.println(f);
		long l = (long) f; // 8����Ʈ ������ -> �Ҽ��� �ڷ��� ���� �߻�
		System.out.println(l);
		int i = (int) l; // 4����Ʈ ������
		System.out.println(i);
		System.out.println(Integer.toBinaryString(i));
		short s = (short) i; // 2����Ʈ ������ -> �ڷ��� ���� �߻�
		System.out.println(Integer.toBinaryString(s));
		System.out.println(s);
		byte b = (byte) s; // 1����Ʈ ������ -> �ڷ��� ���� �߻�

		System.out.println(b);

	}

	// �Ϲ��� ����ȯ (Promotion: implicit casting)
	private static void promotionEx() {
		// byte < short < int < long < float < double
		// ǥ������ ���� �ڷ��� -> ���� �ڷ������� �ڵ� ��ȯ�����Ѵ�.
		byte b = 25; // 1byte ������
		System.out.println(b);
		short s = b; // 2byte ����
		System.out.println(s);
		int i = s; // 4byte ����
		System.out.println(i);
		long l = i; // 8byte ����
		System.out.println(l);
		float f = l; // 4byte �Ǽ�
		System.out.println(f);
		double d = f; // 8byte �Ǽ�
		System.out.println(d);
	}

	// ���
	private static void constantEx() {

		System.out.println("���Ѽӵ� : " + SPEED_LIMIT);

		int limit = SPEED_LIMIT;
		System.out.println("���� ������ ���� �ӵ��� " + limit + "�Դϴ�.");

		// �ڵ��� �������� �ڵ��� ������ ����������.

//		SPEED_LIMIT = 320; // ���� �õ� -> �Ұ�
		System.out.println("������ " + SPEED_LIMIT + "�Դϴ�");

	}

	private static void varEx() {
		/*
		 * ������ �ĺ��� ��Ģ 1. ����, ����, $, _ ��� ���� 2. ���ڷ� ������ �� ����. 3. ������ ����� �� ����. 4. ����,
		 * �޼����� ����Ģ�� : camelCase
		 */

		// int age; // ����, �޸𸮿� �̸��� ����.
		// age = 50;
		int age = 34; // ���� + �ʱ�ȭ

		// �ڹٴ� ����Ÿ�� ����̱� ������, �ٸ� Ÿ���� �����͸� ���� �� ����.
		// age = 3.14; -> error �߻�

		// ��ȸ :
		System.out.println("����� ���̴� " + age + "�� �Դϴ�");

		// �ѹ��� ���� ������ ������ ��
		int v1 = 10, v2 = 20, v3 = 30;
		// ���� ������ ������ ���� �Ҵ��ϰ��� �� ��
		v1 = v2 = v3 = 40;
	}

	// ������ ������ Ÿ��
	private static void integerEx() {
		// byte(1) < Short (2) < int(4) < long(8)
		int intVar1, intVar2; // �ΰ��� ������ ������ ����
		intVar1 = 2021; // �ʱ�ȭ
//		intVar2 = 22342122212; // out of range - ������� �ʰ�
		System.out.println(Integer.toBinaryString(intVar1));

		long longVar1, longVar2;
		longVar1 = 2021L;
		longVar2 = 23487123123L;
		System.out.println(longVar1);
		System.out.println(longVar2);

		// 2���� , 8����, 16ģ��
		int bin, oct, hex;
		bin = 0b1101; // 2���� �տ� 0b
		oct = 072; // 8���� �տ� 0
		hex = 0xFF; // 16���� �տ� 0x

		System.out.println(bin);
		System.out.println(oct);
		System.out.println(hex);
	}

	// �Ǽ��� ������ Ÿ��
	private static void floatDoubleEx() {
		// float(4) < double (8)

		float floatVar = 3.141592f;
		double doubleVar = 3.141592;

		System.out.println(floatVar);
		System.out.println(doubleVar);

		// ����ǥ���
		floatVar = 3e-6f; // 3 * 10^-6;
		doubleVar = 3E10; // 3 * 10^10
		System.out.println(floatVar);
		System.out.println(doubleVar);

		// �ε��Ҽ��� ����� ����
		// float, double���� ��� ���е��� ����
		// ǥ�� ������ ���� ��
		// ���� �Ǽ� ó������ �������� ����.

		System.out.println(0.1 * 3);

	}

	// ���� ������ Ÿ��
	private static void booleanEx() {
		// 1byte : true or false
		// ���� �б�, �ݺ��� � Ȱ�� -> �߿��� �ڷ���

		boolean b1 = true;
		boolean b2 = false;

		System.out.println(b1);
		System.out.println(b2);
		// �� ����, �������� ����� Ȱ��ȴ�.

		int a = 7, b = 3;
		boolean result = a > b;
		System.out.println(result);

	}

	// ������ ������ Ÿ��
	private static void charEx() {
		// ��ȣ�� ���� ���� �ڵ�
		char ch1 = 'A';
		char ch2 = '��';
//		char ch3 = "��";

		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch1 + ch2);

		String str = "A��";
		System.out.println(str);

	}
}
