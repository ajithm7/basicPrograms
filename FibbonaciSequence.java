package com.program75;
//41.Program to Display Fibonacci Sequence
import java.util.Scanner;
public class FibbonaciSequence {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,fibo=0,a=0,b=1,i;
		System.out.println("Enter the number :");
		n=sc.nextInt();
		sc.close();
		System.out.println("Fibonacci Sequence is ");
		for(i=0;i<n;i++) {
			fibo+=a;
			a=b;
			b=fibo;
			System.out.print(fibo+" ");
			
		}
		

	}

}
