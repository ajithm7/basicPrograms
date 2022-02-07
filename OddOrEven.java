package com.program75;
//32.Program to Check Whether a Number is Even or Odd
import java.util.Scanner;
public class OddOrEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int a=sc.nextInt();
		sc.close();
		if(a%2==0) {
			System.out.println(a +" is a even number");
		}
		else
		{ 
			System.out.println(a +" isn't a even number");
		}
	}

}
