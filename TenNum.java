package com.program75;
/*1) Write a program to print the mobile number using primitive datatypes.
Input : 9876543210
2) Write a program to print numbers from 1 -10. Use appropriate datatype for the
variables.*/

import java.util.Scanner;

public class TenNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Mobile number
		System.out.println("Enter your (ten digit) mobile number:");
		long mobileNo = sc.nextLong();
		System.out.println("Your mobile no:" + mobileNo);
		//Number list
		int i = 1, n;
		System.out.println("Enetr how many you want : ");
		n = sc.nextInt();
		System.out.println("Number List:");
		while (i <= n) {
			System.out.println(i);
			i++;
			sc.close();
		}

	}

}
