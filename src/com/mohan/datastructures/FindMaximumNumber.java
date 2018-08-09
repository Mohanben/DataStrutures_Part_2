/**
 * 
 */
package com.mohan.datastructures;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FindMaximumNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] maxArray;
		int maxNumber = 0;
		Scanner scanner = new Scanner(System.in);
		try {
			int N = scanner.nextInt();
			maxArray = new int[N];
			for (int i = 0; i < N; i++) {
				maxArray[i] = scanner.nextInt();
			}
			for (int i = 0; i < maxArray.length - 1; i++) {
				for (int j = i + 1; j < maxArray.length - 1; j++) {
					if (maxArray[i] > maxArray[j]) {
						maxNumber = maxArray[i];
					} else {
						maxNumber = maxArray[j];
					}
				}
			}
			System.out.println("----Maximum of N Number-----" + maxNumber);
		} catch (InputMismatchException e) {
			System.err.println(e);
		}
		scanner.close();
	}

}
