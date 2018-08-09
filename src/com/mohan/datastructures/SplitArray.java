/**
 * 
 */
package com.mohan.datastructures;

import java.util.Scanner;

public class SplitArray {

	/**
	 * @param args
	 */
	private static int[] numArray;
	private static int[] splitArray1, splitArray2;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		numArray = new int[N];
		int splitSize = N / 2;
		splitArray1 = new int[splitSize];
		splitArray2 = new int[splitSize];
		if (N < 0) {// Base Condition
			extracted();
		} else {// inductive condition
			for (int i = 0; i < N; i++) {
				numArray[i] = scanner.nextInt();
			}
			for (int i = 0; i < numArray.length / 2; i++) {
				splitArray1[i] = numArray[i];
				splitArray2[i] = numArray[splitSize++];
				System.out.println("----First Array----" + splitArray1[i]);
				System.out.println("----Second Array----" + splitArray2[i]);
			}
		}
		scanner.close();
	}

	private static void extracted() {
		return;
	}

}
