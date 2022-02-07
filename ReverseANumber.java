package com.program75;
//46.Program to Reverse a Number
import java.util.Scanner;
public class ReverseANumber {
	
		    static int reversDigits(int num)
		    {
		        int rev = 0;
		        while (num > 0) {
		            rev = rev * 10 + num % 10;
		            num = num / 10;
		        }
		        return rev;
		    }
		 
		    public static void main(String[] args)
		    {
		    	Scanner sc=new Scanner(System.in);
		    	System.out.println("Enter more than one number : ");
		        int num;
		        num=sc.nextInt();
		        sc.close();
		        System.out.println("Reverse number is : "
		                           + reversDigits(num));
		    }
}
