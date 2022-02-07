package com.program75;

/*17) Write a program with Unary operators
18) Write a program with Ternary Operator
19) Write a program with bitwise operators*/
import java.util.Scanner;

public class UnaryOperator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Unary operator
		System.out.print("Enter your number1:");
		int num1 = sc.nextInt();
		int num = -num1;

		System.out.println("Your unary nummber is:" + num);
		// Ternary Operator and bitwise
		String positive = "Your Number1 is Positive";
		String negative = "Your Number1 is Negative";
		String zero = "Your Number is Zero";
		String name;
		name = num1 == 0 ? (zero) : num1 > 0 ? (positive) : (negative);
		System.out.println(name);

		// 19)Bitwise operators
		System.out.println("Enetr your second number2:");
		int num3, num2 = sc.nextInt();
		sc.close();
		// Bitwise AND
		System.out.println("Number1 & Number2 = " + (num1 & num2));

		// Bitwise OR
		System.out.println("Number1 | Number2 = " + (num1 | num2));

		// Bitwise XOR
		System.out.println("Number1 ^ Number2 = " + (num1 ^ num2));

		// Binary Complement Operator
		System.out.println("~Number2 = " + ~num2);

		// Binary Left Shift Operator
		num3 = num1 << 1;
		System.out.println("Number1 << 1 = " + num3);

		// Binary Right Shift Operator
		num3 = num1 >> 1;
		System.out.println("Number1 >> 1  = " + num3);

		// Shift right zero fill operator
		num3 = num1 >>> 2;
		System.out.println("Number1 >>> 1 = " + num3);
	}
}