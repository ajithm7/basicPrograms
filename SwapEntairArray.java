package com.sixtyprograms;

import java.util.Scanner;

/*Swap all elements of array 
 * Eneter size of an array :  3
Eneter element of an array :  
1 2 3
4 5 6
7 8 9
Enter rotation number : 2
8 9 1 
2 3 4 
5 6 7*/
public class SwapEntairArray {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		SwapEntairArray two = new SwapEntairArray();
		two.solving();
	}

	private void solving() {
		System.out.print("Eneter size of an array :  ");
		int n = scanner.nextInt();
		System.out.println("Eneter element of an array :  ");
		int arr[][] = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = scanner.nextInt();
			}

		}
		swaping(arr, n);
	}

	private void swaping(int[][] arr, int n) {
		System.out.println("Enter rotation number : ");
		int k = scanner.nextInt();
		while (k-- > 0) {
			int previous = arr[n - 1][n - 1];
			int next = 0;
			for (int i = 0; i < n; i++) {
				next = arr[i][0];
				arr[i][0] = previous;
				previous = next;
				for (int j = 1; j < n; j++) {
					next = arr[i][j];
					arr[i][j] = previous;
					previous = next;
				}
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
