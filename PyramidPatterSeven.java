package com.program75;

import java.util.Scanner;

public class PyramidPatterSeven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numRows;
		System.out.println("Enter you Number of Rows: ");
		numRows = sc.nextInt();
		sc.close();

		for (int i = numRows; i >= 1; i--) {

			for (int k = numRows - 1; k >= i; k--) {

				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {

				System.out.print(i + " ");

			}
			System.out.println();

		}
	}

}
