package com.program75;
//40.Program to Generate Multiplication Table
import java.util.Scanner;
public class GenerateMultiplicationTable {

  public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num,i;
		System.out.println("Enter which table you want : ");
		num = sc.nextInt();
		System.out.println("Enter howmany rows you want : ");
		i=sc.nextInt();
		sc.close();
		        for (int j = 1; j <= i; j++) {
		            
		            System.out.println(num + " * " + j + " = "
		                               + num * j);
		 }
	}

}
