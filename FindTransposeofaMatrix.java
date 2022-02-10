package com.program75;
//67.Program to Find Transpose of a Matrix
import java.util.Scanner;

public class FindTransposeofaMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Give rows and column");
		int rows, col;
		rows = sc.nextShort();
		col = sc.nextShort();
		int a[][] = new int[rows][col];
		int b[][] = new int[col][rows];

		System.out.println("Enter element value of matrix :");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < col; j++) {
				a[i][j] = sc.nextShort();
				}
			}
		sc.close();

		for (int i = 0; i < col; i++) {
			for (int j = 0; j < rows; j++) {
				System.out.print((b[i][j] = a[j][i]) + " ");
			}
			System.out.println();
		}
	}
}
