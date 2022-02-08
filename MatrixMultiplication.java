package com.program75;
//66.Program to Multiply Two Matrices Using Multi-dimensional Arrays
import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a[][] = new int[10][10];
		int b[][] = new int[10][10];
		int c[][] = new int[10][10];
		int i, j,k, rowA, colA;
		int rowB, colB;
		System.out.println("Enter rows and col of A <10 : ");
		rowA = sc.nextInt();;
		colA = sc.nextInt();
		System.out.println("Enter rows and col of B <10 : ");
		rowB = sc.nextInt();;
		colB = sc.nextInt();
		
		System.out.println("Enter the matrix value of A : ");
		for (i = 0; i < rowA; i++) {
			for (j = 0; j < colA; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		
		
		System.out.println("Enter the matrix value of B : ");
		for (i = 0; i < rowA; i++) {
			for (j = 0; j < colA; j++) {
				b[i][j] = sc.nextInt();
			}
		}sc.close();

		for (i = 0; i < rowA; i++) {
			for (j = 0; j < colA; j++) {
				
				c[i][j]=0;
				for(k=0;k<rowA;k++) {
				c[i][j] = c[i][j] + b[i][k]*a[k][j];}
			} System.out.println();
		}
		System.out.println("Multiplication of two matrix is ");
		{
			for (i = 0; i < rowA; i++) {
				for (j = 0; j < colA; j++) {
					System.out.print(c[i][j]+"  ");
				}
				System.out.println();
			}

		}

	}

}
