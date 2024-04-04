package com.day02;

import java.util.Arrays;

public class D02P42 {
	public static void main (String[] args) {
		
		int[] A = {3, 2, 4, 5, 6, 4, 5, 7, 3, 2, 3, 4, 7, 1, 2, 0, 0, 0};
		
		int sum = 0;
		for (int i = 0; i<A.length-1; i++) {
			sum = sum + A[i];
		}
		A[15] = sum;
		double average =  (double) sum/15;
		A[16] = (int) Math.round(average);
		
		int min = A[0];
		for (int i = 1; i<15; i++) {
			if(A[i] < min) {
				min = A[i];
			}
		}
		A[17] = min;
		for (int i = 0; i<18; i++) {
			System.out.print(A[i]);
		}
		
	}
	
	

}
