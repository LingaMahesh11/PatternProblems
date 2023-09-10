package com.kn.PatternProblems;

public class ReversePatternByNumbersDecreasing {

	public static void main(String[] args) {
		pattern();
	}
	static void pattern() {
		for (int i = 1;i<=5;i++) {
			for (int j = 1;j<=5;j++) {
				if (i <= j ) {
					System.out.print(i + " ");
				}
				else {
					System.out.print("  ");
				}
			}
		System.out.println();
		}
	}	

}