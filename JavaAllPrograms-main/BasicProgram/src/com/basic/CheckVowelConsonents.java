package com.basic;

 

public class CheckVowelConsonents {
	static void vowel_or_consonant(char y)
	{
		if(y=='a'||y=='e'||y=='i'||y=='o'||y=='u')
		{
			System.out.println("It is vowel");
		}
		else {
			System.out.print("It is consonant");
		}
	}

	public static void main(String[] args) {
		 vowel_or_consonant('b');
		 
		 vowel_or_consonant('a');
		

	}

}
