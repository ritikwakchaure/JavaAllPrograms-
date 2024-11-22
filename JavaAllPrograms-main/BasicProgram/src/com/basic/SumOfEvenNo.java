package com.basic;

import java.util.Scanner;

public class SumOfEvenNo {

	public static void main(String[] args) {
		System.out.println("Enter value of n :");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		long sum=0;
	    int i=2;
	    while(i<=n)
	    {
	    	sum=sum+i;
	    	i=i+2;
	    }
	    System.out.print(sum);

	}

}
