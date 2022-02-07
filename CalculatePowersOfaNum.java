package com.program75;
//47.Program to Calculate the Power of a Number
import java.util.Scanner;

public class CalculatePowersOfaNum {

	static int power(int n, int p) {
		if (p == 0)
			return 1;
		else
			return n * power(n, p - 1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();
		System.out.println("Enter power : ");
		int p = sc.nextInt();
		sc.close();

		System.out.println("Power value of your number : " + power(n, p));
	}
}