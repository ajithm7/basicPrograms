package com.program75;
//36.Program to Check Whether a Number is Positive or Negative
import java.util.Scanner;
public class PositiveOrNegative {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int num;
		System.out.println("Enter your number : ");
		num=sc.nextInt();
		sc.close();
		if(num>0||num<0) {
			if(num>0) {
				System.out.println(num +" is a positive number");
			}
			else {
				System.out.println(num +" is a negative number");
			}
		}
		else {
			System.out.println(num +" is zero");
		}

	}

}
