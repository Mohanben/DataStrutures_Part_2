package com.mohan.datastructures;

import java.util.Scanner;

public class LinearSearchAlgorithm {

	private static int[] searchArray = { 10, 20, 80, 30, 60, 50, 110, 100, 130, 170 };

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int searchNumber = scanner.nextInt();
		int length = searchArray.length;
		int foundNumber = searchElemet(searchArray, length, searchNumber);
		System.out.println(foundNumber);
		scanner.close();
	}

	private static int searchElemet(int[] searchArray, int length, int searchNumber) {
		for (int i = 0; i < length; i++) {
			if (searchArray[i] == searchNumber) {
				return searchNumber;
			}
		}
		return -1;
	}

}
