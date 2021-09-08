package com.java.class10;

//         1
//		  121
//       12312
//      1234123
//     123451234

public class PrintFullPyramid {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {

			for (int s = 1; s <= 5 - i; s++) {
				System.out.print(' ');
			}

			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}

			for (int j = 1; j <= i - 1; j++) {
				System.out.print(j);
			}

			System.out.println();
		}
	}
}
