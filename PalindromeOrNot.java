package com.program75;
//48.Program to Check Whether a Number is Palindrome or Not
import java.util.Scanner;
public class PalindromeOrNot {
	
	static void checkPali(int a) {
		int initialNum = a;
		int finalNum = 0, temp;

		while (a != 0) {

			temp = a % 10;

			finalNum = (finalNum * 10) + temp;

			a = a / 10;}	if(initialNum== finalNum) {
				
				System.out.println(initialNum + " is Palindrome.");
			}else {
				System.out.println(initialNum + " is Not Palindrome.");}
		}
	

public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n = sc.nextInt();                                        
		sc.close();
		checkPali(n);		
	

	}

}
