package com.sixtyprograms;

import java.util.Scanner;
/* Write a program to print a letters from the user input character to 'Z' without using
strings.
Example 1:  input : X
Output : XYZ
Example 2:  Input : M
Output : MNOPQRSTUWXYZ
*/
public class CharacterSeries {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.printf("Enter Alphabets from A to Z are: \n");
		char character=scanner.next().charAt(0);
		for (; character <= 'Z' && character>='A'; character++) {
			System.out.print(character +" ");
		}
		scanner.close();
	}
}