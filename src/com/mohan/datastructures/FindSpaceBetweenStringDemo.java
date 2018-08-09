/**
 * 
 */
package com.mohan.datastructures;

import java.util.Scanner;

public class FindSpaceBetweenStringDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String string = "Newton is father of physics and i loved him lot because i am verymuch interested in Science \n";
		String newString = null;
		int length = string.length();
		for (int i = 0; i < length; i++) {
			if (string.charAt(i) != ' ') {
				newString += string.charAt(i);
				System.err.println("enter");
			} else {

				System.err.println("enter not" + newString.length());
			}
		}
		System.out.println(newString);
		scanner.close();
	}

}
