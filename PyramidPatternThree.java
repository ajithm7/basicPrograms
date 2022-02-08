package com.program75;

import java.util.Scanner;

public class PyramidPatternThree {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numRows;
		System.out.println("Enter number of rows : ");
		numRows = sc.nextInt();
		sc.close();

		for (int a = 1; a <= numRows; a++) {
			for (int c = a; c < numRows; c++)
				System.out.print(" ");

			for (int b = 1; b <= a; b++)
				System.out.print("* ");

			System.out.println();
		}

	}

}
