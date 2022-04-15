package com.sixtyprograms;

import java.util.Scanner;

/* Find if a String2 is substring of String1. If it is, return the index of the first
occurrence. else return -1.
 Eg 1:Input:
        String 1: test123string
         String 2: 123
        Output: 4
Eg 2: Input:
        String 1: testing12
        String 2: 1234 
        Output: -1*/
public class FindSecondStringIsSubStringOfStringOne {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		FindSecondStringIsSubStringOfStringOne two = new FindSecondStringIsSubStringOfStringOne();
		two.solving();
	}

	private void solving() {
		System.out.println("Enter first string : ");
		String string1 = scanner.next();
		System.out.println("Enter second string : ");
		String string2 = scanner.next();
		int count = -1;
		int length = string1.length() - string2.length();
		for (int i = 0; i < length; i++) {
			if ((string1.substring(i, i + string2.length())).equals(string2)) {
				count = i;
			}
		}
		System.out.println(count);
	}

}
