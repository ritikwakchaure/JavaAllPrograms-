package com.basic;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		System.out.println("Enter value of n :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		 int i,temp,r,sum=0;
		 temp=n;
		 while(n>0) {
			 r=n%10;
			 sum=(sum*10)+r;
			 n=n/10;
		 }
		if(temp==sum)
		{
			System.out.println("Palindrome NO");
		}
		else 
		{
			System.out.println("Its not a palindrome no");
		}
		

	}

}
