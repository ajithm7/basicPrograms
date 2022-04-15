package com.sixtyprograms;

import java.util.Scanner;
/* Write a program to print the alphabet 'C' with the stars based on the given numbers
Eg 1:  Input: 4
        Output:
****
*
*
*****/
public class PrintCPattern {

	public static void main(String[] args) {
		PrintCPattern cPattern = new PrintCPattern();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = scanner.nextInt();
		cPattern.cPattern(num);
		scanner.close();
	}
	public void cPattern(int n) {
		for(int i=1;i<=n;i++) {
			
				if(i==1||i==n) {
					for(int k=1;k<=n;k++) {
						System.out.print("*");
					}
				}else {
					
						System.out.print("*");
					
				}
				
			System.out.println();
		}
	}
}
