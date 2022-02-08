package com.program75;

import java.util.Scanner;

public class SumOfNaturalNumUsingRecursion {
	static int naturalSum(int n) {

		if (n > 0) {

			return n + naturalSum(n - 1);
		} else
			return 0;
					}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number ");

		int n = sc.nextInt();
		sc.close();

		System.out.println("Sum of " +n+" natural number is "+naturalSum(n));

	}


}