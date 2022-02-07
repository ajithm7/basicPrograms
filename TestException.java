package com.program75;

public class TestException {

	public static void main(String[] args) {

		try {

			int arry[] = null;
			System.out.println(arry[1]);

		} // exception>RuntimeException>ArithmaticException>
		catch (NullPointerException | ArithmeticException e) {

			System.out.println("Null exception in try");
		}


		finally {
			System.out.println("Even catch final also print");
		}
	}
}
