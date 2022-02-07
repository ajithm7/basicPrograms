package com.program75;
//65.Program to Add Two Matrices Using Multi-dimensional Arrays
import java.util.Scanner;

public class MatrixAddition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[][] = new int[10][10];
		int b[][] = new int[10][10];
		int c[][] = new int[10][10];
		int i, j, row, col;
		System.out.println("Enter rows<10 : ");
		row = sc.nextInt();
		System.out.println("Enter col<10 : ");
		col = sc.nextInt();
		System.out.println("Enter the matrix value of A : ");
		for (i = 0; i < row; i++) {
			for (j = 0; j < col; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter the matrix value of B : ");
		for (i = 0; i < row; i++) {
			for (j = 0; j < col; j++) {
				b[i][j] = sc.nextInt();
			}
		}

		for (i = 0; i < row; i++) {
			for (j = 0; j < col; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		System.out.println("Addition of two matrix is ");
		{
			for (i = 0; i < row; i++) {
				for (j = 0; j < col; j++) {
					System.out.print(c[i][j]+"  ");
				}
				System.out.println();
			}

		}

	}

}
