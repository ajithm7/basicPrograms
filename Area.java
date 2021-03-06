package com.program75;

/*12) Write a program to find the area of the square
13) Write a program to find the area of the rectangle
14) Write a program to find the area of the cylinder
16) Given the radius of two concentric circle, find the area of the space between the circles.
*/
import java.util.Scanner;

public class Area {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Area area = new Area();
		area.areOption();

	}

	public void areOption() {
		System.out.println("Select any one below :\n1->Square\n2->Rectangle\n3->Cylinder\n4->Two concentric circle");
		char ch = sc.next().charAt(0);
		switch (ch) {
		case '1' -> areaOfSquare();
		case '2' -> areaOfRectangle();
		case '3' -> areaOfCylinder();
		case '4' -> areaOfTwoConcentricCircle();
		default -> System.err.println("Enter valid selection");
		}
	}

	// square
	public void areaOfSquare() {
		System.out.println("Enter side value of square:");
		float sqArea, sqSide = sc.nextFloat();
		sqArea = sqSide * sqSide;
		System.out.println("Area of the square=" + sqArea);
	}

	// rectangular
	public void areaOfRectangle() {
		System.out.println("Enter Width and Lengtgh value of rectangle:");
		int w = sc.nextInt();
		int l = sc.nextInt();
		float recArea = w * l;
		System.out.println("Area of rectangle=" + recArea);
	}

	// cylinder
	public void areaOfCylinder() {

		System.out.println("Enter the radius ans height of the cylinder");
		double r = sc.nextDouble();
		double h = sc.nextDouble();
		double cylinderArea = (2 * Math.PI) * (r * r) * (r + h);
		System.out.println("Area of the cylinder is :" + cylinderArea);
	}

	// two concentric circle
	public void areaOfTwoConcentricCircle() {
		System.out.println("Enter the langer circle radius:");
		double r1 = sc.nextDouble();
		System.out.println("Enter the smaller circle radius:");
		double r2 = sc.nextDouble();
		double conCentricArea = Math.PI * (r1 * r1 - r2 * r2);
		sc.close();
		System.out.println("Area b/w the two concentric circle:" + conCentricArea);
	}
}
