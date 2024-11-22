package com.basic;

import java.util.Scanner;

public class SwappingOfTwoNo {

	public static void main(String[] args) {
		System.out.println("Enter value of n1 and n2 :");
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		int n3;
		
		n3=n1;
		n1=n2;
		n2=n3;
		
		System.out.println("Value of n1 is " +n1+ " Value of n2 is " +n2);
		
		

	}

}
