package com.program75;
/*9) Evaluate the following statements on paper and on program and understand the
difference
public static void main(String arg[]) {
System.out.println(7+7);
System.out.println(7+7.0);
System.out.println(7+'7');
}
10) Evaluate the following statements on paper and on program and understand the
difference
System.out.println(true);
System.out.println(false);
System.out.println(true&true);
System.out.println(true&false);
11) Write a program to print the number 7.50 without using String.*/
public class OutputDiff {

	public static void main(String[] args) {

		System.out.println(7+7);
		System.out.println(7+7.0);
		System.out.println(7+'7');
		
		
		System.out.println(true);
		System.out.println(false);
		System.out.println(true&true);
		System.out.println(true&false);
		
		float a=7.50f;
		System.out.printf("%.2f",a);

	}

}
