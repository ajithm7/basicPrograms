package com.sixtyprograms;

import java.util.Scanner;
/*Enter size of array : 
4
Enter your key position : 2
4 1 2 3 
8 5 6 7 
12 9 10 11 
16 13 14 15*/
public class SwappingWithoutArray {

	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		SwappingWithoutArray two = new SwappingWithoutArray();
		two.solving();
	}
	private void solving() {
		System.out.println("Enter size of array : ");
		int arraySize=scanner.nextInt();
		System.out.println("Enter your key position : ");
		int key=scanner.nextInt()-1;
		key=key%arraySize;
		for(int i=0;i<arraySize;i++) {
			for(int j=0;j<arraySize;j++) {
				if(j<key) {
					System.out.print(arraySize-key+(i*arraySize)+(j+1)+" ");
				}else {
					System.out.print((i*arraySize)+j-key+1+" ");
				}	
			}
			System.out.println();
		}
	}
}
