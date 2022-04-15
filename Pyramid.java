package com.sixtyprograms;

import java.util.Scanner;

/*Write a program to make such a pattern like a pyramid with numbers increased by 1.
Eg:  Input : 10
Output:
     1
    2 3
   4 5 6
  7 8 9 10
*/
public class Pyramid {

	public static void main(String[] args) {
		Pyramid objPyramid=new Pyramid();
		Scanner sc = new Scanner(System.in);
		double r1, r2, real, img;
		System.out.println("Enter number :");
		int sum=sc.nextInt();
		double a = 1;
		double b =1;
		double c =-2*sum;
		sc.close();
		double determinant = b * b - 4 * a * c;
		if (determinant == 0) {
			r1 = -b / 2 * a;
			r2 = -b / 2 * a;
			System.out.printf("Roots are : %.2f", r1);
			System.out.printf(" Roots are : %.2f", r2);
		}

		else if (determinant > 0) {
			r1 = (-b + Math.sqrt(determinant)) / 2 * a;
			r2 = (-b - Math.sqrt(determinant)) / 2 * a;
			System.out.printf("Roots are : %.2f ", r1);
			System.out.printf(" Roots are : %.2f", r2);
		}
		else {
			real = -b / (2 * a);
			img = Math.sqrt(-determinant) / (2 * a);
			r1 = real - img;
			r2 = real + img;
			System.out.printf("Roots are :  %.2f", r1);
			System.out.printf(" Roots are :  %.2f", r2);
		}
		System.out.println("\n");
		int row=(int) ((r1>0)?r1:r2);
		objPyramid.pyramid(row,sum);
	}

	private void pyramid(int row, int sum) {
		int vlue=1;
		for(int i=0;i<row;i++) {
			for(int j=row-1;j>i;j--) {
				System.out.print(" ");
			}for(int j=0;j<=i;j++) {
				System.out.print(vlue+" ");
				vlue++;
			}
			System.out.println();
		}
	}
}
