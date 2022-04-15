package com.sixtyprograms;

import java.util.Scanner;
/* Write a program to give the following output for the given input:
Eg 1:  Input: a1b10
Output: abbbbbbbbbb
Eg: 2:  Input: b3c6d15
           Output: bbbccccccddddddddddddddd
The number varies from 1 to 99.
*/
public class NumberOfLetters {

	public static void main(String[] args) {
		NumberOfLetters sum = new NumberOfLetters();
		Scanner scanner = new Scanner(System.in);
		String string = scanner.next();
		System.out.println(sum.encode(string));
		scanner.close();
	}

	String encode(String str) {
		int start = 0;
		String result = "";
		for (int i = 0; i < str.length(); i++) {

			if (Character.isDigit(str.charAt(i))) {
				int startIndex = i;
				int temp = 0;
				while (i < str.length() && Character.isDigit(str.charAt(i))) {
					temp = temp * 10 + str.charAt(i) - '0';
					i++;
				}
				i--;
				String sub = str.substring(start, startIndex);
				result += sub.repeat(temp);
				start=i+1;
			}
		}
		return result;
	}

}
