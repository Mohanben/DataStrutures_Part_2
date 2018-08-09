package com.mohan.datastructures;

import java.util.Scanner;

public class MethodDemo {

	public static void main(String[] args) {
		int A, B, C;
		Scanner scanner = new Scanner(System.in);
		A = scanner.nextInt();
		B = scanner.nextInt();
		C = scanner.nextInt();
		System.out.println("-----Before Method Call----- " + A + "-" + B + "-" + C);
		method(A, B, C);
		System.out.println("-----After Method Call----- " + A + "-" + B + "-" + C);
		scanner.close();
	}

	private static void method(int a, int b, int c) {
		int A = 10, B = 20, C = 30;
		System.out.println("-----Inside Method Call----- " + A + "-" + B + "-" + C);
	}

}
