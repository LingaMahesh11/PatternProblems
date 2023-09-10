package com.kn.PatternProblems;

public class PatternProblem3 {

	public static void main(String[] args) {
		pattern();

	}

	static void pattern() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (i + j == 4 || j - i == 2) {
					System.out.print("*");

				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}
	}
}