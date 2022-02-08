package com.program75;

import java.util.Scanner;

//50.Program to Check Armstrong Number
public class CheckArmstrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to check Armstrong or Not");
		int num = sc.nextInt();
		int armStg = num;
		int numOfDigits = 0;
		int temp = 0;
		sc.close();
		while (armStg != 0) { // for calculate num of Digits
			numOfDigits++;
			armStg /= 10;
		}
		armStg = num;
		while (armStg != 0) { // each digit powered by no of digits
			int digit = armStg % 10;
			temp += Math.pow(digit, numOfDigits);
			armStg /= 10;
		}
		System.out.print((temp == num) ? "Armstrong number" : "not Armstrong");
	}
}