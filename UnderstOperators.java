package com.program75;

/*21) Evaluate the following expression on paper and on program and understand the
difference
i) ++a-b–                   ii) a%b++     iii)  a*=b+5               iv) x=69>>>2
 22) Evaluate the following expression on paper and on program and understand the
difference
k+=k++ + ++k + –k + k–; when k=28
23) Evaluate the following expression on paper and on program and understand the
differencek+=k++ + ++k + –k + k–; when k=28
x = x++ * 2 + 3 * –x;
24) Evaluate the following expression on paper and on program and understand the
difference
If int y = 10 then find int z = (++y * (y++ + 5));
25) Evaluate the following expression on paper and on program and understand the
difference
What is the value of w1 if
w=5?, w1=++w – w++ + –w*/
import java.util.Scanner;

public class UnderstOperators {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// i) ++a-b– ii) a%b++ iii) a*=b+5 iv) x=69>>>2
		int a, b;
		System.out.println("Enter number a,b:");
		a = sc.nextInt();
		b = sc.nextInt();
		int c = ++a - b--;// where a=a+1,b=b-1
		System.out.println("++a-b–- = " + c);
		int d = a % b++;// where a=a+1,b=b-1
		System.out.println("a%b++ = " + d);
		int i = a *= b + 5;// where a=a+1,b=b
		System.out.println("a*=b+5 = " + i);
		int j = 69 >>> 2;
		System.out.println("69>>>2 = " + j);
		// k+=k++ + ++k + –k + k–; when k=2
		System.out.println("Enter k : ");
		int k = sc.nextInt();
		k += k++ + ++k + -k + k--;
		System.out.println("k+=k++ + ++k + -k + k-- = " + k);
		// x = x++ * 2 + 3 * –x;
		System.out.println("Enter x value : ");
		int x = sc.nextInt();
		x = x++ * 2 + 3 * -x;
		System.out.println("x = x++ * 2 + 3 * –x  = " + x);
		// int y = 10 then find int z = (++y * (y++ + 5));
		System.out.println("Enter y value : ");
		int y = sc.nextInt();
		System.out.println("z = (++y * (y++ + 5)) = " + y);
		// w=5, w1=++w – w++ + –w
		System.out.println("Enter w value : ");
		int w = sc.nextInt();
		sc.close();
		int w1 = ++w - w++ + -w;
		System.out.println("w1=++w – w++ + –w* =  " + w1);
	}

}
