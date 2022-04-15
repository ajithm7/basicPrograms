package com.sixtyprograms;
/* Write a program to display the number in reverse order without use of String
functions.
Eg 1:  Input: 12345
Output :The number in reverse order is : 54321
*/
public class ReverseNumberWithOutString {

	public static void main(String[] args) {
		ReverseNumberWithOutString obj=new ReverseNumberWithOutString();
		obj.reverse();
	}
	public void reverse() {
		int number=12345;
		int sum=0;
		while(number>0) {
			int temp=number%10;
			number/=10;
			sum=sum*10+temp;
		}
		System.out.print(sum);
	}
}
