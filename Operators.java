package com.sixtyprograms;

public class Operators {

	public static void main(String[] args) {
		/*
		 * Evaluate the following expression on paper and on program and understand the
		 * difference
		 */
		/*
		 * What is the value of x1 if x=5 ? x1=++x – x++ + –x
		 */
		int x = 5;
		System.out.println("x1 =" + (++x - x++ + -x));

		/*
		 * Evaluate the following expression on paper and on program and understand the
		 * difference If int y = 10 then find int z = (++y * (y++ + 5));
		 */
		int y = 10;
		System.out.println("z = " + (++y * (y++ + 5)));

		/*
		 * Evaluate the following expression on paper and on program and understand the
		 * difference x = x++ * 2 + 3 * –x;
		 */
		x = 5;
		System.out.println(x++ * 2 + 3 * -x);

		/*
		 * Evaluate the following expression on paper and on program and understand the
		 * difference a+=a++ + ++a + –a + a–; when a=28
		 */
		int a = 28;
		a += a++ + ++a - a + a - +a;
		System.out.println(a);

		/*
		 * Evaluate the following expression on paper and on program and understand the
		 * difference i) ++a-b– ii) a%b++ iii) a*=b+5 iv) x=69>>>2
		 */
		
		
	}

}
