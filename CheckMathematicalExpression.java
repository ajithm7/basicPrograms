package com.sixtyprograms;

import java.util.Scanner;

public class CheckMathematicalExpression {
	public static void main(String[] args) {
		CheckMathematicalExpression o = new CheckMathematicalExpression();
		o.solve();
	}

		private void solve() {
			Scanner scanner=new Scanner(System.in);
			System.out.println();
			String s = scanner.nextLine();
			scanner.close();
			validation(s);
		}
		private void validation(String s) {
			int i, parantheses = 0;
			for (i = 0; i < s.length(); i++) {
				if (s.charAt(i) == '(')
					parantheses++;
				else if (s.charAt(i) == ')')
					parantheses--;
				else if (s.charAt(i) == '*' || s.charAt(i) == '/'
						|| s.charAt(i) == '+' || s.charAt(i) == '-') {
					if (s.charAt(i - 1) > 96 && s.charAt(i - 1) < 123
							&& s.charAt(i + 1) > 96 && s.charAt(i + 1) < 123) {
					} else
						break;
				}
			}
			if (i == s.length() && parantheses == 0)
				System.out.println("Valid");
			else
				System.out.println("Invalid");

		}
}
