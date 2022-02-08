package com.program75;

import java.util.Scanner;
import java.lang.Math;

public class DisplayArmstrongNumBwTwoIntervals {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Start to End ArmStrong Numbers list");
		int numOne = sc.nextInt();
		int numTwo = sc.nextInt();
		sc.close();
		for (; numOne <= numTwo; numOne++) {
			int arm = numOne;
			int numOfDigit = 0;
			int temp = 0;

			while (arm != 0) { // this loop for find number of digits
				numOfDigit++;
				arm /= 10;
			}
			arm = numOne;
			while (arm != 0) { // each digit powered by no of digits
				int digit = arm % 10;
				temp += Math.pow(digit, numOfDigit);
				arm /= 10;
			}
			System.out.print((temp == numOne) ? (numOne + " ") : "");
		}
	}
}
