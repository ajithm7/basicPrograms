package com.program75;

//68.Program to Multiply two Matrices by Passing Matrix to a Function
import java.util.Scanner;

public class MultiplyTwoMatricesByPassingMatrixToFunction {

	public static void multiMatrix(int a[][], int b[][],int rowA,int colA,int  rowB,int colB) {
		int c[][] = new int[rowA][colB];

		for (int i = 0; i < rowA; i++) {
			for (int j = 0; j < colB; j++) {
				c[i][j] = 0;
				for (int k = 0; k < colA; k++) {
					c[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		System.out.println("Multiple of matrix A and B is : ");
		for (int i = 0; i < rowA; i++) {
			for (int j = 0; j < colB; j++)
				System.out.print(c[i][j] + " ");

			System.out.println();
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row and column of matrix A :");
		int rowA, colA, rowB, colB;
		rowA = sc.nextShort();
		colA = sc.nextShort();
		System.out.println("Enter row and column of matrix B :");
		rowB = sc.nextShort();
		colB = sc.nextShort();
		int a[][] = new int[rowA][colA];
		int b[][] = new int[rowB][colB];

		if (colA == rowB) {
			System.out.println("Enter row and column values of matrix A :");
			for (int i = 0; i < rowA; i++) {
				for (int j = 0; j < colA; j++) {
					a[i][j] = sc.nextInt();
				}
			}
			System.out.println("Enter row and column values of matrix B :");
			for (int i = 0; i < rowB; i++) {
				for (int j = 0; j < colB; j++) {
					b[i][j] = sc.nextInt();
				}
			}
			sc.close();

			multiMatrix(a, b, rowA,colA, rowB, colB);

		} else {
			System.out.print("This type of matrix cannot be multiply");
		}
	}
}
