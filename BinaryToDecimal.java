package com.program75;

import java.util.Scanner;
public class BinaryToDecimal {
    static int binaryToDecimal(long binary) 
    {
        int decimalNumber = 0, i = 0;
        while (binary > 0) { 
            decimalNumber
                += Math.pow(2, i++) * (binary % 10);
            binary /= 10;
        }
        return decimalNumber;}
    
    static int deciToBinary(int deci) {

		int reminder;
		String stringinput = "";
		while (deci != 0) {
			reminder = deci % 2;
			stringinput = stringinput + reminder;
			deci /= 2;
		}
		String temp = "";
         //reverse string
		for (int i = stringinput.length() - 1; i >= 0; i--) {
			temp += stringinput.charAt(i);
		}

		// System.out.println(t);
		int binary = Integer.parseInt(temp);

		return binary;
	}
    	
      // calculate count of the integer
	public static int countNum(int a) {
		int count = 0;
		do {
			count++;
			a = a / 10;
		} while (a != 0);
		return count;}
  
    public static void main(String[] args)
    {
    	Scanner sc = new Scanner(System.in);
		long x;
		System.out.println("Enter your binary number :");
		x = sc.nextInt();
        System.out.println("decimal number:"+ binaryToDecimal(x));
        
        int y;
        System.out.println("Enter your decimal number :");
        y=sc.nextInt();
        sc.close();
        System.out.println("decimal number:"+ deciToBinary(y));
        
        
        
    }
}