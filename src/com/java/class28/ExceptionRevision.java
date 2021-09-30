package com.java.class28;

public class ExceptionRevision {
	public static void main(String[] args) {
		int i = 15, j = 3;
		int a[] = new int[5];

		try {
			System.out.println(i / j); // Arithmetic Exception
		} catch (Exception e) {

			try {
				System.out.println(a[1]);
			} catch (Exception umed) {
				System.out.println("Exception handled"); // line 2
			}
		}
	}
}
