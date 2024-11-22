package com.basic;

import java.util.Scanner;

public class FactorialNo {

	public static void main(String[] args) {
		 
		System.out.println("Enter value of n :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		 int fact=1;
		 int i;
		 for(i=1;i<=n;i++)
		 {
			 fact=(i*fact);
		 }
		System.out.println(fact);

	}

}
