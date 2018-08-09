/**
 * 
 */
package com.mohan.datastructures;

import java.util.Scanner;

/**
 * @author mchandra
 *
 */
public class ExchangeSortingDemo {
	/**
	 * @param args
	 */
	private static int[] sortArray;

	private static int temp = 0;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			int N = scanner.nextInt();
			sortArray = new int[N];
			for (int i = 0; i < N; i++) {
				sortArray[i] = scanner.nextInt();
			}
			for (int i = 0; i <= N; i++) {
				for (int j = i + 1; j < N; j++) {
					if (sortArray[i] < sortArray[j]) {
						temp = sortArray[i];
						sortArray[i] = sortArray[j];
						sortArray[j] = temp;
					}
				}
			}

			for (int i = 0; i < N; i++) {
				System.out.println("----Sorted Array------- " + sortArray[i]);
			}
		} catch (Exception e) {
		}
		scanner.close();
	}

}
