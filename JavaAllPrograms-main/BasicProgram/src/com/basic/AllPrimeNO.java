package com.basic;

import java.util.Scanner;

public class AllPrimeNO {

	public static void main(String[] args) {
		System.out.println("Enter value of n :");
		Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
		 
		 for(int i=2;i<=n;i++) {
			 boolean isfact=true;
			 for(int j=2;j<=i/2;j++) {
				 if(i%j==0) {
					 isfact=false;
					 break;
				 }
			 }
		 
		 if(isfact==true)
	    	{
	    		System.out.println(i);
	    	}
	    
		 }
	}

}
