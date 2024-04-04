package com.day02;

import java.util.Scanner;

public class D02P41 {
	public static void main(String[] args) {
		int[] a = {5,23,40,24,39};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any 2 numbers from 1 to 40 to check wether they present in the array or not");
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		
		boolean foundNum1 = false;
		boolean foundNum2 = false;
		
		for(int i = 0; i<a.length; i ++) {
			if (a[i] == number1) {
				foundNum1 = true;
			}
			if(a[i] == number2) {
				foundNum2 = true;
			}
		}
		
		
		if (foundNum1 && foundNum2) {
			System.out.println("Bingo");
		}
		else {
			System.out.println("Not Found");
		}
		
		
		
		
	}

}
