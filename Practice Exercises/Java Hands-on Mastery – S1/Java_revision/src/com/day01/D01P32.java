package com.day01;

import java.util.Scanner;

public class D01P32 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Give a number from 1 to 7 to know the day what that was");
		
		int day = sc.nextInt();
		String[] days = {"Monday", "Tuesday", "Wednesday" , "Thursday", "Friday", "Saturday", "Sunday"};
		
		if(day >=1 && day<= 7) {
			System.out.println("Day : " + days[day-1]);
			
		}
		else {
			System.out.println("Invalid Input");
		}
		sc.close();  
		
	}

}
