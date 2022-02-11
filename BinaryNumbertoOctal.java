package test;
//62.Program to Convert Binary Number to Octal and vice-versa
import java.util.Scanner;
public class BinaryNumbertoOctal {

	   static void ocatlToBin(long oct) {
		  String bin=new String();
			int num=0;	  
		  System.out.println("Your binary number : ");
		while(oct>0) {
				num=num*10;
				int i=(int)(oct%10);
				num=num+i;
				oct=oct/10;
		}
		
		while(num>0){
			    int i=num%10;
				int j=i%8;
				switch(j) {
				case 0: bin="000";
				break;
				case 1: bin="001";
				break;
				case 2: bin="010";
				break;
				case 3: bin="011";
				break;
				case 4: bin="100";
				break;
				case 5: bin="101";
				break;
				case 6: bin="110";
				break;
				case 7: bin="111";
				break;
				
				}
				num=num/10;
				System.out.print(bin+" ");
			}
		System.out.println();
		}
          static void	binToOctal(long binary) {
        	  int bin=0;
        	  switch((int)binary){
        	    case 000: bin+=0;
				break;
				case 001: bin+=1;
				break;
				case 010: bin+=2;
				break;
				case 011: bin+=3;
				break;
				case 100: bin+=4;
				break;
				case 101: bin+=5;
				break;
				case 110: bin+=6;
				break;
				case 111: bin+=7;
				break;
        	  }
        	  System.out.print("Your octal number : "+bin);
          }
	  
	
	public static void main(String[] args) {
			
		//BinaryNumbertoOctal obj=new BinaryNumbertoOctal();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  your octal number : ");
		long octal=sc.nextLong();
		ocatlToBin(octal);
		
		System.out.println("Enetr your Binary number : ");
		long binary=sc.nextLong();
		binToOctal(binary);
		sc.close();

	}

}
