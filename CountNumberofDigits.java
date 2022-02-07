package com.program75;

//45.Program to Count Number of Digits in an Integer
import java.util.Scanner;

public class CountNumberofDigits {

	static int countDigit(long n) {
		int count = 0;
		while (n != 0) {
			n = n / 10;
			++count;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n;
		System.out.println("Enter your number : ");
		n = sc.nextLong();
		sc.close();
		System.out.print("Number of digits : " + countDigit(n));
	}
}