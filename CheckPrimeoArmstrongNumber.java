package com.program75;
//55.Program to Check Prime or Armstrong Number Using User-defined method
import java.util.Scanner;

public class CheckPrimeoArmstrongNumber {

	public static int isPrime(int n) {
		if (n == 1)
			return 0;

		else if ((n % 5 != 0) && (n == 2 || n == 3 || (n % 6 == 1 || n % 6 == 5)))
			return 1;

		return 0;
	}

	public static int isArmstrong(int n) {
		int num = n;
		int arm = num;
		int numOfDigits = 0;
		int adDigitPow = 0;
		while (arm != 0) {
			numOfDigits++;
			arm /= 10;
		}
		arm = num;
		while (arm != 0) {
			int digit = arm % 10;
			adDigitPow += Math.pow(digit, numOfDigits);
			arm /= 10;
		}
		return (adDigitPow == num) ? 1 : 0;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number to check it Armstrong or Prime");
		int num = sc.nextInt();
		int pNum = isPrime(num);
		int aNum = isArmstrong(num);
		sc.close();
		if (pNum == 1) {
			if (aNum == 1)
				System.out.print("Both Prime and Armstrong");
			else
				System.out.print("Prime");
		} else if (aNum == 1)
			System.out.print("Armstrong");
		else
			System.out.print("Both not");

	}

}