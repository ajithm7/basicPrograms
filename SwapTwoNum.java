package com.program75;
//31.Program to Swap Two Numbers
import java.util.Scanner;

public class SwapTwoNum {

	static void swap(int i, int j) {
		i += j;
		j = i - j;
		i = i - j;
		System.out.println("After swap: " + i + "," + j);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, j;
		System.out.println("Enter two numbers :");
		i = sc.nextInt();
		j = sc.nextInt();
		sc.close();
		System.out.println("Before a swap : " + i + "," + j);
		swap(i, j);
}
}