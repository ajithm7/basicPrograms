package com.program75;
//26.Conversion programs like km to Miles, centigrade to fahrenheit, sqft to acre etc
import java.util.Scanner;
public class UnitConversion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// km to Miles
		float km;
		double mile;
		System.out.println("Enetr your km value : ");
		km=sc.nextFloat();
		mile=km/1.609;
		System.out.println(km+"is equal to "+mile+"miles");
		
		//centigrade to fahrenheit,
		float cen,fah;
		System.out.println("Enter centigrade value :  ");
		cen=sc.nextFloat();
		fah=cen*9/5+32;
		System.out.println(cen+" centigrade is equal to "+fah+" fahreheit");
		//sqft to acre 
		System.out.println("Enter your square feet : ");
		int sqft=sc.nextInt();
		double acre;
		acre=sqft/43560;
		System.out.println(sqft+" square feet speed is equal to "+acre+" acre");
		
		
		//km per hr to m per sec
		float kph,mps;
		System.out.println("Enter speed in km/hr : ");
		kph=sc.nextFloat();
		sc.close();
		mps=(18/5)*kph;
		System.out.println(kph+" km/hr speed is equal to "+mps+" m/s");
	}

}
