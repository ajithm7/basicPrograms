package com.sixtyprograms;

import java.util.Scanner;

/*Write a program to print the following pattern for the given input number.
Eg 1:  Input: 4
        Output:
********
***__***
**____**
*______*
**____**
***__***
*********/
public class SqurePattern {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number : ");
		int n=scanner.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=n-i;j>0;j--) {
				System.out.print("*");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("-");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("-");
			}for(int j=n-i;j>0;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}for(int j=1;j<n-i;j++) {
				System.out.print("-");
			}for(int j=1;j<n-i;j++) {
				System.out.print("-");
			}
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
		
			System.out.println();
		}
		scanner.close();
	}

}
