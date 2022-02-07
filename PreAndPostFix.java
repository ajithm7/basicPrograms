package com.program75;

//20) Write a program to find the difference between prefix and postfix operator
import java.util.Scanner;

public class PreAndPostFix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number a:");
		int a = sc.nextInt();
		sc.close();
        // preIncrement, where initial a=a
		++a;
		System.out.println("preIncrement value of a: " + a);
		// postIncremen, where initial a=a+1
		a++;
		System.out.println("postIncrement value of a: " + a);
		// preDecrement, where initial a=a+2
		--a;
		System.out.println("preDecrement value of a: " + a);
		// postDecrement, where initial a=a=a+1
		a--;
		System.out.println("postDeccrement value of a: " + a);

	}
}
