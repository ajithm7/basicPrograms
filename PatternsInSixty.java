package com.sixtyprograms;

import java.util.Scanner;

public class PatternsInSixty {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		
		  for(int i=1;i<=t;i++) { 
			  for(int j=i;j<t;j++) { System.out.print("  "); }
		  for(int k=1;k<=i;k++) { System.out.print(k+" "); } 
		  for(int k=i;k>1;k--) {System.out.print(k+" "); } 
		  for(int j=i;j<t;j++) { System.out.print("  "); }
		  System.out.println(); }
		  
		  for(int i=1;i<=t;i++) { 
			  for(int j=i;j<=t;j++) {System.out.print("  "); } 
			  for(int k=t-i+1;k<t;k++) { System.out.print(k+" ");} 
			  for(int k=t;k>=t-i+1;k--) { System.out.print(k+" "); } 
			  for(int j=i;j<t;j++){ System.out.print("  "); }
		  System.out.println(); }
		 

		for (int i = 1; i <= t; i++) {
			for (int j = 1; j < i; j++) {System.out.print(" ");}
			for (int j = i; j <= t; j++) {System.out.print("* ");}
			System.out.println();}
		for (int i = 1; i <= t; i++) {
			for (int j = 1; j < i; j++) {System.out.print(" ");}
			for (int j = i; j <= t; j++) {System.out.print(t-i+1+" ");}
			System.out.println();}
		scanner.close();
	}

}
