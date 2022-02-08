package com.program75;

import java.util.Scanner;

//52.Program to Display Factors of a Number
public class FactorsOfaNumbers {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your num : ");
	int num = sc.nextInt();
	sc.close();
	System.out.print("Factors of your number :");
	for(int i=1;i<=num;i++) {;
		if(num%i==0) {
			System.out.print(i+" ");
		
	}

	}

	}}
