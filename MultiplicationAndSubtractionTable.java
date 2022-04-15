package com.sixtyprograms;

import java.util.Scanner;
/*Write a single program to generate a multiplicaiton and subtraction table for a given
number.
*/
public class MultiplicationAndSubtractionTable {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number to generate multiplication table : ");
		int number=scanner.nextInt();
		System.out.println("\nMultiplication Table : \n");
		for(int i=1;i<=10;i++) {
		System.out.println(i+" * "+number+" = "+(i*number));
		}
		System.out.println("\nSubtraction Table : \n");
		int maxNumber=number*11;
		while(maxNumber!=number) {
		System.out.println(maxNumber+" - "+number+" = "+(maxNumber-number));
		maxNumber-=number;
		}
		scanner.close();
	}

}
