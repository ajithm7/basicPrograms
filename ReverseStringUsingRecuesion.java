package com.sixtyprograms;

import java.util.Scanner;
/*Using Recursion reverse the string such as
Eg 1:  Input: one two three
       Output: three two one
Eg 2:  Input: I love india
       Output: india love I*/
public class ReverseStringUsingRecuesion {
	static Scanner scanner = new Scanner(System.in);
	static String resultString = "";

	public static void main(String[] args) {
		ReverseStringUsingRecuesion two = new ReverseStringUsingRecuesion();
		two.solving();

	}

	private void solving() {
		System.out.println("Enter first string : ");
		String string = scanner.nextLine();
		reverseString(string);
		System.out.println(resultString.strip());
	}

	public void reverseString(String str) {
		
		String s = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			if (i == 0) {
				s = str.charAt(i) + s;
				resultString += " " + s;
			} 
			else if (str.charAt(i) != ' ') {
				s = str.charAt(i) + s;
			} 
			else {
				resultString += " " + s;
				s = "";
				//System.err.println(resultString);
				reverseString(str.substring(0, i));
				return;
			}
		}

	}

}
