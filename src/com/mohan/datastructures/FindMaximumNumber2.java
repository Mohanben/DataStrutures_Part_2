/**
 * 
 */
package com.mohan.datastructures;

import java.util.Scanner;
public class FindMaximumNumber2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int max = 0;
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		System.out.println("Enter the Number");
		max = scanner.nextInt();
		for (int i = 0; i < N; i++) {
			int number = scanner.nextInt();
			if (max < number) {
				max = number;
			} else {

			}
		}
		System.err.println("-------Maxmimum of N number is " + max);
		scanner.close();
	}

}
