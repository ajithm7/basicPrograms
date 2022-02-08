package com.program75;

import java.util.Scanner;

public class SimpleCalculatorUsingswitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("                 CALCULATOR\n              ");
		System.out.println("+ =  Add\n- = Subtract\n* = Multiply\n/ = Divide\n");
		System.out.println("Enter any one of the above options");
		switch (sc.next().charAt(0)) {
		case '+':
			System.out.println("Give Two numbers For Addition");
			System.out.print(sc.nextInt() + sc.nextInt());
			break;
		case '-':
			System.out.println("Give Two numbers For Subtraction");
			System.out.print(sc.nextInt() - sc.nextInt());
			break;
		case '*':
			System.out.println("Give Two numbers For Multiply");
			System.out.print(sc.nextInt() * sc.nextInt());
			break;
		case '/':
			System.out.println("Give Two numbers For Divide");
			System.out.print(sc.nextInt() / sc.nextInt());
			sc.close();
			break;
		default:
			System.out.print("Enter only in the above options");
		}

	}

}
