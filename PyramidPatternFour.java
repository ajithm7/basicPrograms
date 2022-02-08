package com.program75;

import java.util.Scanner;

public class PyramidPatternFour {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numRows;
		System.out.println("Enter you Number of Rows: ");
		numRows = sc.nextInt();
		sc.close();

		for (int a = 1; a <= numRows; a++) { // Row loop

			for (int c = a; c < numRows; c++) {
				System.out.print("  ");// space loop
			}

			for (int b = 1; b <= a; b++) {

				System.out.print(b + " ");// first number loop
			}

			for (int n = a - 1; n >= 1; n--) {
				System.out.print(n + " ");
			}
			System.out.println();
		}

	}

}
