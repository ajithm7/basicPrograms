package com.program75;

import java.util.Scanner;

public class PyramidPatternSix {

	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
    	System.out.println("Enter number of rows : ");
        int numRows =sc.nextInt();
        sc.close();
		
		for(int i=1;i<=numRows;i++) {
			
			for(int j=1;j<=i;j++) { 
				System.out.print(" ");
			}
			
			for(int j=i;j<=numRows;j++) {
				System.out.print("* ");	
			}
			System.out.println();
		}

	}

}