package com.sixtyprograms;

import java.util.Scanner;
/* Write a program to print the following output for the given input. You can assume the
string is of odd length
Eg 1:  Input: 12345
        Output:
1       1
  2   2
    3
  4   4
5        5*/
public class CrossNumberPattern {

	public static void main(String[] args) {
		Scanner scanner=new  Scanner(System.in);
		System.out.println("Enter odd number above one : ");
		int number=scanner.nextInt();
		for(int i=1;i<=number;i++) {
			for(int j=1;j<=number;j++) {
				if(i==j||j==(number-i+1)){
					System.out.print(i);
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		scanner.close();
		
	}

}
