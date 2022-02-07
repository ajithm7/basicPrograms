package com.program75;

//39.Program to Find Factorial of a Number
import java.util.Scanner;

public class Factorials {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, i, facto = 1;
		System.out.println("Enter the number : ");
		n = sc.nextInt();
		sc.close();
		for (i = 1; i <= n; i++) {
			facto *= i;
		}
		System.out.println("Factorial of " + n + " is " + facto);
	}
}
