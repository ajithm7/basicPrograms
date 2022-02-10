package com.program75;
//64.program to calculate the power using recursion.
import java.util.Scanner;

public class CalculatThePowerUsingRecursion {

	public static int powerOfNum(int a, int b) {
		if (b == 0) {
			return 1;}
		else {
		return (a*powerOfNum(a, --b) );}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number and Power of number : ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(powerOfNum(a,b));
		sc.close();

	}

}