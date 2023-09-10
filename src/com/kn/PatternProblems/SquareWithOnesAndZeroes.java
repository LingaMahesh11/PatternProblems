package com.kn.PatternProblems;

public class SquareWithOnesAndZeroes {

	public static void main(String[] args) {
		pattern();
	}
	static void pattern() {
		int n = 5;
		for(int i = 1;i<=n;i++) {
			for(int j = 1;j <=n ;j++) {
				if ((i+j)%2 == 0) {
					System.out.print("1" + " ");
				}
				else {
					System.out.print("0"+" ");
				}
			}
		System.out.println();
		}
	}
}
