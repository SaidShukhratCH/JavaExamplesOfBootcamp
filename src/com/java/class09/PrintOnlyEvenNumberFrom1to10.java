package com.java.class09;

// Write a program to print even number from 1 to 10 
// output 
// 2 4 6 8 10
public class PrintOnlyEvenNumberFrom1to10 {
	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}

	}
}
