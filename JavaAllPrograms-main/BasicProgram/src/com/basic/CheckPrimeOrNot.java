package com.basic;

import java.util.Scanner;

public class CheckPrimeOrNot {

	public static void main(String[] args) {
		System.out.println("Enter value of n :");
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		
		  boolean isfact=false;
		  for(int i=2;i<=n/2; i++)
		  {
			  if(n%i==0)
			  {
				  isfact=true;
				  break;
			  }
		  }
		  if(!isfact)
		  {
			  System.out.println("Pime no");
		  }
		  else
		  {
			  System.out.println("Not prime no");
		  }

	}

}
