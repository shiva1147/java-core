package com.day02;

import java.util.Scanner;

public class D02P59 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentance");
		String input = sc.nextLine();
		String Answer = input.replaceAll( "\\s", "%20");
		System.out.println(Answer);
		sc.close();
	}

}
