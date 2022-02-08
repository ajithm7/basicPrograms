package com.program75;

import java.util.Scanner;

public class FindGCDnormalMethod {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
    	System.out.println("Enter two numbers : ");
        int a =sc.nextInt(), b = sc.nextInt();
        sc.close();
        if(a<b){
        	int temp=a;
        	a=b;
        	b=temp;}
        while(b!=0) {
        	int c;
        	c=a%b;
        	a=b;
        	b=c;
        }
        	System.out.println("GCD is  :"+ a);
        }

	}
