package com.program75;

//34.Program to Find the Largest Number Among Three Numbers
import java.util.Scanner;

public class LargestNo {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		float a,b,c;
		System.out.println("Enter your a,b and c : ");
		a=sc.nextFloat();
		b=sc.nextFloat();
		c=sc.nextFloat();
		sc.close();
		if (a>=b) {
			if(a>=c){
				System.out.println(a+" is a Largest Number");
			}
			else{
				System.out.println(c+" is a Largest Number");}
			}
	  else {
			if(b>=c) {
				System.out.println(b+" is a Largest Number");
				}
			else{
				System.out.println(c+" is a Largest Number");
			}
			}
		
		

	}

}
