package com.program75;

//62.Program to Convert Binary Number to Octal and vice-versa
import java.util.Scanner;

public class BinaryNumbertoOctal {

	public static void main(String[] args) {

		// BinaryNumbertoOctal obj=new BinaryNumbertoOctal();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  your octal number : ");
		int octal = sc.nextInt();
		ocatlToBin(octal);

		System.out.println("Enetr your Binary number : ");
		long binary = sc.nextLong();
		binToOctal(binary);
		sc.close();

	}

	static void ocatlToBin(int oct) {
		int num = 0;
		System.out.println("Your binary number : ");
		String binary = "";
		while (oct > 0) {
			num = oct % 10;
			oct = oct / 10;
			int j = num;
			switch (j) {
			case 0 -> binary = "000 " + binary;
			case 1 -> binary = "001 " + binary;
			case 2 -> binary = "010 " + binary;
			case 3 -> binary = "011 " + binary;
			case 4 -> binary = "100 " + binary;
			case 5 -> binary = "101 " + binary;
			case 6 -> binary = "110 " + binary;
			case 7 -> binary = "111 " + binary;
			}
		}
		System.out.println(binary);
		System.out.println();
	}

	static void binToOctal(long binary) {
		String oct = "";
		while (binary > 0) {
			long n = binary % 1000;
			binary=binary/1000;
			switch ((int) n) {
			case 0 -> oct = 0 + oct;
			case 1 -> oct = 1 + oct;
			case 10 -> oct = 2 + oct;
			case 11 -> oct = 3 + oct;
			case 100 -> oct = 4 + oct;
			case 101 -> oct = 5 + oct;
			case 110 -> oct = 6 + oct;
			case 111 -> oct = 7 + oct;
			}
		}
		System.out.print("Your octal number : " + oct);
	}

}
