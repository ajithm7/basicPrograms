package com.program75;

import java.util.Scanner;

//27.Leap year or not
public class LeapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year : ");
		int year = sc.nextInt();
		sc.close();
		if (year % 4 == 0) {
			if (year % 100 == 0 && year % 400 != 0) {
				System.out.println(year + " isn't a leap year");
			} else {
				System.out.println(year + " is a leap year");
			}
		} else {
			System.out.println(year + " isn't a leap year");
		}
	}
}
