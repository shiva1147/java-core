package com.day02;

import java.util.Scanner;

public class D02P51 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Anything to check its length and either it is palindrome or not");
		String word = sc.next();//shiva
		int length = word.length();
		System.out.println("Length of the given word : " + length);
		String upperCase = word.toUpperCase();
		System.out.println("Given word in UpperCase : " + upperCase);
		char ch; String reverse = "";
		for (int i = 0; i<word.length(); i++) {
			 ch = word.charAt(i);
			 reverse = ch +reverse;
		}
		System.out.println(reverse);
		if(word.equals(reverse)) {
			System.out.println("The given word is Palindrome");
		}else {
			System.out.println("Not a Palindrome");
		}
		sc.close();
	}

}
