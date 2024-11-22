package com.basic;

import java.util.Scanner;

public class SumOfEvenAndOdd {

	public static void main(String[] args) {
		System.out.println("Enter value of n :");
		Scanner sc=new Scanner(System.in);
		String n=sc.next();
		int Even=0;
		int Odd=0;
		for(int i=0;i<n.length();i++) {
			int m=(n.charAt(i)-48);
			if(m%2==0) {
				Even=Even+m;
			}
			else {
				Odd=Odd+m;
			}
		}
	    System.out.println(Even+" "+Odd);

	}

}
