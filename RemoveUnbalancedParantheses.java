package com.sixtyprograms;

import java.util.Scanner;
/* Remove unbalanced parentheses in a given expression.

    Eg.) Input  : ((abc)((de))
         Output : ((abc)(de))  

         Input  : (((ab)
         Output : (ab)*/
public class RemoveUnbalancedParantheses {
	public static void main(String[] args) {

		RemoveUnbalancedParantheses o = new RemoveUnbalancedParantheses();
		o.solve();
	}

		private void solve() {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter string :");
			String s = scanner.nextLine();
			printPair(s);
			scanner.close();
		}

		private void printPair(String s) {
			int open = 0, close = 0;
			StringBuffer l = new StringBuffer(s);
			for (int i = 0, j = s.length() - 1; i < s.length(); i++, j--) {
				if (s.charAt(i) == '(') {
					open++;
				} else if (s.charAt(i) == ')') {
					open--;
				}
				if (s.charAt(j) == ')') {
					close++;
				} else if (s.charAt(j) == '(') {
					close--;
				}
				if (open < 0) {
					l.deleteCharAt(i);
				}
				if(close<0) {
					l.deleteCharAt(j);
				}

			}
			System.out.println(l);

		}

		
	}

