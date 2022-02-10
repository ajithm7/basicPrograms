package com.program75;

import java.util.Scanner;

public class DeciToOctal {
	
    static int octulToDecimal(long octal) 
    {
        int deciNum = 0, i = 0;
        while (octal > 0) { 
            deciNum+= Math.pow(8, i++) * (octal % 10);
            octal /= 10;
        }
        return deciNum;}

	public void decToOctal(int n) {

		int[] octalNum = new int[100]; // array to store octal number

		int i = 0;                     // counter for octal number array
		while (n != 0) {

			octalNum[i] = n % 8;        // storing remainder in octal array
			n = n / 8;
			i++;
		}
           System.out.print("your octal : ");
		for (int j = i - 1; j >= 0; j--) {// Printing octal number array in reverse order
			System.out.print(octalNum[j]);}
		System.out.println("");
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your decimal :");
		int a = sc.nextInt();
		DeciToOctal ob =new DeciToOctal();
		ob.decToOctal(a); // by function call
		
		System.out.println("Enter your octal : ");
		int b = sc.nextInt();
		System.out.println("your decimal : "+octulToDecimal(b));//by function returns
		sc.close();
	}

}
