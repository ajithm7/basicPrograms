package com.program75;
//44.Program to Display Characters from A to Z Using Loop
public class CharactersAtoZ {
	public static void main(String[] args)
		    {
		        char i;
	
		        System.out.printf("The Alphabets from A to Z are: \n");
		 
		        for (i = 'A'; i <= 'Z'; i++)
		        {
		            System.out.printf("%c ", i);
		        }System.out.println();
		        System.out.println("Another way for A to Z : ");
		        char a='A';
		        for(int n=0;n<26;n++) {
		        	System.out.printf("%c ",a+n);
		        }
		 
		    }
}