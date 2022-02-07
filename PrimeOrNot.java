package com.program75;
//49.Program to Check Whether a Number is Prime or Not
import java.util.Scanner;
public class PrimeOrNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i,j=0;
		System.out.println("Enter a positive integer : ");
		n=sc.nextInt();
		sc.close();
		for(i=2;i<=n/2;++i) {
			if(n%i==0) {
				
				j=1;
				break;
			}
		}
		if(j==0) {
			System.out.println(n +" is a prime number");
		}
		else {
			System.out.println(n +" is a prime number");
			}
	}

}
