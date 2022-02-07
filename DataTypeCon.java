package com.program75;

/* 5) Write a program to print the value of byteNumber of the following statements.
short shortNumber = 150;
byte byteNumber =(byte) shortNumber;
 6) Write a program to print the value of intNumber of the following statements.
float floatNumber = 150.9f;
int intNumber =(int) floatNumber;
7) Write a program to print the value of number7 of the following statements.
char character7 = '7';
int number7 = (int) character7;
8) Write a program to print the value of character55 of the following statements.
int number55 = 55;
char character55 = (char) number55;*/
import java.util.Scanner;

public class DataTypeCon {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// convert from short to byte
		System.out.println("Enter yourshort:");
		short shortNumber = sc.nextShort();
		byte byteNumber = (byte) shortNumber;
		System.out.println("your short = byte is:" + byteNumber);
		// convert from float to int
		System.out.println("Enter your float num:");
		float floatNumber = sc.nextFloat();
		int intNumber = (int) floatNumber;
		System.out.println("your float = int is:" + intNumber);
		// convert from char to int
		System.out.println("Enter your char:");
		char characterInt;
		characterInt = sc.next().charAt(0);
		int number = (int) characterInt;
		System.out.println("7 your char = int is:" + number);
		// convert from int to char
		System.out.println("Enter your int num:");
		int numberChar = sc.nextInt();
		sc.close();
		char charActer = (char) numberChar;
		System.out.println("your int = char is:" + charActer);

	}

}
