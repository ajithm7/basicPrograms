package com.program75;

//37.Program to Check Whether a Character is an Alphabet or not
import java.util.Scanner;

public class CharAlphabetOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char a;
		System.out.println("Enter your character : ");
		a = sc.next().charAt(0);
		sc.close();
		int num = (int) a;
		if (num > 64 && num < 91) {
			System.out.println("You enter an Alphabet(Upper Case)");
		} else if (num > 98 && num < 123) {
			System.out.println("You enter an Alphabet(Lower Case)");
		} else {
			System.out.println("You enter a not Alphabet");
		}

	}

}
