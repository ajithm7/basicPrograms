package com.sixtyprograms;

import java.util.Scanner;
/* write a program to find the difference between the given number and it's reverse
number.
Example 1: Input : 12345
Output : 12345 - 54321 = -41976
Example 2: Input : 543
Output : 543 - 345 = 198*/
public class DifferenceBetweenReverseNumber {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int number=scanner.nextInt();
		int reverseNumber=0;
		int copyOfNumber=number;
		while(number!=0) {
			int temp =number%10;
			number/=10;
			reverseNumber=(reverseNumber*10)+temp;
		}
		System.out.print("Your answer is : ");
		System.out.print(copyOfNumber-reverseNumber);
		scanner.close();
	}

}
