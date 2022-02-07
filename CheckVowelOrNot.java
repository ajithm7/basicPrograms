package com.program75;

//33.Program to Check Whether a Character is a Vowel or Consonant
import java.util.Scanner;

public class CheckVowelOrNot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//char vowel[] = {'a','e','i','o','u'};
		System.out.println("Enter your Char : ");
		char getChr = sc.next().charAt(0);
		sc.close();
		switch(getChr){
			case 'a':
				System.out.println(getChr +" is a vowel");
				break;
			case 'e':
				System.out.println(getChr +" is a vowel");
				break;
			case 'i':
					System.out.println(getChr +" is a vowel");
					break;
			case 'o':
						System.out.println(getChr +" is a vowel");
						break;
			case 'u':
				System.out.println(getChr +" is a vowel");
				break;	
			default:
				System.out.println(getChr +" is a consonant");
		}
		
		
	}

}
