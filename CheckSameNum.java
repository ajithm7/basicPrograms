package com.program75;
/*3) Write a program to check if the following numbers are the same or different?
Input: 6, 6L
 * 4)Write a program to check the following numbers are the same or different?
Input: 6.02f, 6.02d*/
import java.util.Scanner;

public class CheckSameNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//check int & long are same
		int i=sc.nextInt();
		long j=sc.nextLong();
		if(i==j) {
			System.out.println("These Numbers are same");
		}
		else {
			System.out.println("These Numbers are not same");
		}
		//check float & double are same
		float k=sc.nextFloat();
		double n=sc.nextDouble();
		sc.close();
		if(k==n) {
			System.out.println("These numbers are same");
		}
		else {
			System.out.println("These numbers are different");	
		}	
	}
}
