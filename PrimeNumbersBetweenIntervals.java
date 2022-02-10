package com.program75;
//54.Program to Display Prime Numbers Between Intervals Using method
import java.util.Scanner;

public class PrimeNumbersBetweenIntervals {

	private static void getPrime(int start, int end) {
		for (int n = start; n <= end; n++) {
			if (n == 1)
				continue;
			if ((n % 5 != 0) && (n % 7 != 0) && (n == 2 || n == 3 || (n % 6 == 1 || n % 6 == 5))) {
				System.out.print(n + " ");
			}
		}

	}

	public static void main(String[] args) {
		{
		}
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Intevals to print prime in between");
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		getPrime(a, b);
	}

}