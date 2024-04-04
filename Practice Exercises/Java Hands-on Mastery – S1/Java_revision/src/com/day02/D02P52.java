package com.day02;

import java.util.Scanner;

public class D02P52 {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the word");
		String input = sc.next();
		int count = 0;
		String capture = "";
		for (int i = 0;i<input.length(); i++) {
			if(input.charAt(i)=='a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o' || input.charAt(i) == 'u') {
				//capture = 
			}
			 
		}
		System.out.println(" count of the vowels : " +count);
		sc.close();
	}

}
