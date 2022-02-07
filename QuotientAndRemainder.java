package com.program75;
//29.Program to Compute Quotient and Remainder
import java.util.Scanner;
public class QuotientAndRemainder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Quotient and Remainder and dividend=num,divisor=div
		float num,div,q,r;
		System.out.println("Enter your dividend and divisor : ");
		num=sc.nextFloat();
		div=sc.nextFloat();
		q=num/div;
		r=num%div;
		sc.close();
		System.out.println("Value of Quotient and Remainder are : "+q +" , "+r);

	}

}