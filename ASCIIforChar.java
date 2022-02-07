package com.program75;

//28.Program to Find ASCII Value of a Character
import java.util.Scanner;

public class ASCIIforChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char a;
		System.out.println("Enter character :");
		a = sc.next().charAt(0);
		sc.close();
		int n = (int) a;
		System.out.println("ASCII value of " + a + " is " + n);
	}

}
