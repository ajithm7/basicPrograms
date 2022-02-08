package com.program75;

import java.util.Scanner;

public class PyramidPatternFive {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numRows;
		System.out.println("Enter you Number of Rows: ");
		numRows = sc.nextInt();
		sc.close();

		for (int a = numRows; a >= 1; a--) { // row loop

			for (int c = a; c > 1; c--) {
				System.out.print("  ");// space loop
			}
			for (int b = a; b <= numRows; b++) {

				System.out.print(b + " ");// first triangle number loop
			}
			for (int n = numRows - 1; n >= a; n--) {
				System.out.print(n + " ");// Second triangle number loop
			}

			System.out.println();
		}

	}

}
