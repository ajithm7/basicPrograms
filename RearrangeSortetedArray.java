package com.sixtyprograms;

import java.util.Scanner;
/*Alternate sorting: Given an array of integers, rearrange the array in such a way that
the first element is first maximum and second element is first minimum.
Example: Input : {1, 2, 3, 4, 5, 6, 7}
Output: {7, 1, 6, 2, 5, 3, 4}*/
public class RearrangeSortetedArray {

	public static void main(String[] args) {
		Scanner scanner =  new  Scanner(System.in);
		System.out.println("Enter number of element : ");
		int numOfElement=scanner.nextInt();
		int array[]=new int[numOfElement];
		System.out.println("Enter Elements of an array : ");
		for(int i=0;i<numOfElement;i++) {
			array[i]=scanner.nextInt();
		}
		for(int i=0;i<=numOfElement/2;i++) {
		if(i==numOfElement/2) {
			if(numOfElement%2!=0)
			System.out.print(array[i]);
		}
		else {
			System.out.print(array[numOfElement-i-1]+" ");
			System.out.print(array[i]+" ");	}
		}
		scanner.close();
	}
}
