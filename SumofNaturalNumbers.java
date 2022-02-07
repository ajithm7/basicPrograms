package com.program75;

//38.Program to Calculate the Sum of Natural Numbers
import java.util.Scanner;

public class SumofNaturalNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, i, j;
		System.out.println("Enter your two natural number : ");
		i = sc.nextInt();
		j = sc.nextInt();
		num = i + j;
		sc.close();
		if (i <= 0 || j <= 0) {
			System.out.println("your  numbers are not natural number");
		} else {
			System.out.println("Sum of your natural number is " + num);
		}
	}
}
