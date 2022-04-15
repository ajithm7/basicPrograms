package com.sixtyprograms;

import java.util.Scanner;
/* Write a program to find the sum of the series. The series will be like 1 +11 + 111 +
1111 +.. n terms.
Eg 1: Input:  Input the number of terms : 5
Output :
1 + 11 + 111 + 1111 + 11111
The Sum is : 12345
Eg 2: Input:  Input the number of terms : 3
Output :
1 + 11 + 111
The Sum is : 123*/
public class NumberOneSeries {

	public static void main(String[] args) {
		NumberOneSeries objNumberOneSeries=new NumberOneSeries();
		objNumberOneSeries.solving();}

	private void solving() {
		Scanner  scanner=new Scanner(System.in);
		System.out.println("Enter number : ");
		int num=scanner.nextInt();
		int sum=0;
		for(int i=1;i<=num;i++) {
			int count=0;
			int j=i;
			while(j>0) {
				count=count*10+1;
			--j;}
			sum+=count;
		}System.out.println(sum);
		scanner.close();
	}

}
