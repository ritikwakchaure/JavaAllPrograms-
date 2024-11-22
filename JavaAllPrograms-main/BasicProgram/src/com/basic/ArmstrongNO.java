package com.basic;

import java.util.Scanner;

public class ArmstrongNO {

	public static void main(String[] args) {
		System.out.println("Enter value of n :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int sum=0,i,r,temp;
		temp=n;
		while(n>0)
		{
			r=n%10;
			sum=sum+r*r*r;
			n=n/10;
		}
		if(temp==sum)
		{
			System.out.println("Armstrong No");
		}
		else
		{
			System.out.println("not Armstrong no");
		}

	}

}
