package com.java.class10;

//     1
//    12
//   123
//  1234
// 12345

public class NestedLoopsPattern2 {
	public static void main(String[] args) {

		for (int i = 1; i <= 9; i++) {

			for (int ib = 1; ib <= 9 - i; ib++) {
				System.out.print(' ');
			}

			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}

			System.out.println();
		}

	}
}
