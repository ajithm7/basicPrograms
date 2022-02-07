package com.program75;
//43.Program to Find LCM of two Numbers
import java.util.Scanner;
public class FindLCM {

		    // Recursive method to return gcd of a and b
		    static int gcd(int a, int b)
		    {
		        if (a == 0)
		            return b;
		        return gcd(b % a, a);
		    }
		     
		    // method to return LCM of two numbers
		    static int lcm(int a, int b)
		    {
		        return (a / gcd(a, b)) * b;
		    }		     
		    public static void main(String[] args)
		    {
		    	Scanner sc=new Scanner(System.in);
		    	System.out.println("Enter two number : ");
		        int a = sc.nextInt(), b = sc.nextInt();
		        sc.close();
		        System.out.println("LCM of " + a +
		                           " and " + b +
		                      " is " + lcm(a, b));
		    }

}
