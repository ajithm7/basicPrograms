package com.sixtyprograms;

import java.util.Scanner;

/*) Write a program to print the following pattern based on the alphabet.
Example 1:
Input: E
Output:
EEEEE
DDDD
CCC
BB
A
Example 2:
Input:C
Output:
CCC
BB
A
*/
public class CharacterPattern {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Alphabets from A to Z are: ");
		char character = scanner.next().charAt(0);
		int numOfLine = character + 1 - 'A';
		for (int i = 0; i < numOfLine; i++) {
			for (int j = 0; j < numOfLine - i; j++) {
				System.out.print(character);
			}
			character -= 1;
			System.out.println();
		}
		scanner.close();
	}

}
