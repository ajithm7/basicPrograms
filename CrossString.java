package com.sixtyprograms;

import java.util.Scanner;
/* Write a program to print the following output for the given input. You can assume
the string is of odd length
Eg 1:  Input: 12345
        Output:
1       5
  2   4
    3
  2   4
1        5

Eg 2: Input: geeksforgeeks
         Output:
g                         s
  e                     k
    e                 e
      k             e
        s         g
          f      r
             o
          f     r
        s         g
      k             e
    e                 e
  e                      k
g                          s */

public class CrossString {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		CrossString cross=new CrossString();
		cross.solving();
	}

	private void solving() {
		System.out.println("Enter your string : ");
		String string=scanner.next();
		
		for(int i=0;i<string.length();i++) {
			int condition=string.length()-i-1;
			for(int j=0;j<string.length();j++) {
				if(i==j) {
				System.out.print(string.charAt(j));}
				else if(j==condition) {
					System.out.print(string.charAt(j));
				}else System.out.print(" ");
			}
			System.out.println();
		}
	}

}
