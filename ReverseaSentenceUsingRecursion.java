package com.program75;
//63.program to Reverse a Sentence Using Recursion
import java.util.Scanner;

public class ReverseaSentenceUsingRecursion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputString = new String();
		System.out.println("Enter your string : ");
		inputString = sc.nextLine();
		sc.close();
		System.out.println("Reversed string  : " + reverse(inputString));
	}

	public static String reverse(String sentence) {
		if (sentence.isEmpty())
			return sentence;

		return reverse(sentence.substring(1)) + sentence.charAt(0);
	}
}
