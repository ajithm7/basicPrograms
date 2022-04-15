package com.sixtyprograms;

import java.util.Scanner;
/* Write a program for the following. Let consider 20 students in a class with the roll no
101-120. We are going to split them into four groups. Based on their roll number we are
going to split them with the following logics.
Example 1:
Input : Total Number of students : 20
Output:
Group 1:
101
105
109
113
117
Group 2:
102
106
110
114
118
Group 3:
103
107
111
115
119
Group 4:
104
108
112
116
120*/
public class SetGroupsBasedOnRollNumber {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number of student : ");
		int numOfStudent=100+scanner.nextInt();
		for(int i=1;i<=4;i++) {
			System.out.println("group "+i);
			for(int j=100+i;j<=numOfStudent;j+=4) {
				System.out.println(j);
			}System.out.println();
			
		}
		scanner.close();
	}

}
