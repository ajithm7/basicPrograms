package com.program75;
//35.Program to Find the Roots of a Quadratic Equation
import java.util.Scanner;
public class Quadradic {

	public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				double r1, r2, real, img;
				System.out.println("Enter a,b,c:");
				double a = sc.nextDouble();
				double b = sc.nextDouble();
				double c = sc.nextDouble();
				sc.close();
				double determinant = b * b - 4 * a * c;
				if (determinant == 0) {
					r1 = -b / 2 * a;
					r2 = -b / 2 * a;
					System.out.format("Roots are: %.2f", r1);
					System.out.format("Roots are: %.2f", r2);
				}

				else if (determinant > 0) {
					r1 = (-b + Math.sqrt(determinant)) / 2 * a;
					r2 = (-b - Math.sqrt(determinant)) / 2 * a;
					System.out.format("Roots are: %.2f", r1);
					System.out.format("Roots are: %.2f", r2);
				}

				else {
					real = -b / (2 * a);
					img = Math.sqrt(-determinant) / (2 * a);
					r1 = real - img;
					r2 = real + img;
					System.out.format("Roots are: %.2f", r1);
					System.out.format("Roots are: %.2f", r2);
				}

			}

		}
