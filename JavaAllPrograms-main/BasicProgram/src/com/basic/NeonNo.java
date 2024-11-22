package com.basic;

import java.util.Scanner;

public class NeonNo {

	public static void main(String[] args) {
		System.out.println("Enter value of n :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int sum=0,r;
		int square=n*n;
		while(square>0)
		{
			r=square%10;
			sum=sum+r;
			square=square/10;
		}
		if(sum==n)
		{
			System.out.print("Neon no :");
		}
		else
		{
			System.out.print("Not neon");
		}

	}

}
