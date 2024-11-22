package com.basic;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		System.out.println("Enter value of n :");
		Scanner sc = new Scanner(System.in);
		 int n=sc.nextInt();
		 int i;
		 int n1=0, n2=1, n3=0;
		 System.out.print(n1+" "+n2);
		 for(i=2;i<n;i++) {
			 n3=n1+n2;
			 System.out.println( n3);
			 n1=n2;
			 n2=n3;
		 }

	}

}
