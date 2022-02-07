package com.program75;
//42.Program to Find GCD of two Numbers
//59.Program to Find G.C.D Using Recursion
import java.util.Scanner;
public class FindGCD {
		    // Recursive function to return gcd of a and b
		    static int gcd(int a, int b)
		    {
		        if (a == 0)
		          return b;
		        if (b == 0)
		          return a;
		      
		        if (a == b)
		            return a;
		      
		        // a is greater
		        if (a > b) //a=12 b=4
		            return gcd(a-b, b); //(4,4)
		        return gcd(a, b-a);
		    }
		     
		    // Driver method
		    public static void main(String[] args)
		    {
		    	Scanner sc=new Scanner(System.in);
		    	System.out.println("Enter two numbers : ");
		        int a =sc.nextInt(), b = sc.nextInt();
		        sc.close();
		        System.out.println("GCD of " + a +" and " + b + " is " + gcd(b, a));
		    }
}

