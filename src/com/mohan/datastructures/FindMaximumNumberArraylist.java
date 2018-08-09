/**
 * 
 */
package com.mohan.datastructures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FindMaximumNumberArraylist {

	/**
	 * @param args
	 */
	private static ArrayList<Integer> numberList = new ArrayList<>();

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		// Base Condition
		if (N < 0) {
			return;
		} else {// Inductive Condition
			for (int i = 0; i < N; i++) {
				numberList.add(scanner.nextInt());
			}
			int max = Collections.max(numberList);
			System.out.println("------Max ------ " + max);
		}
		scanner.close();
	}

}
