package com.kn.PatternProblems;

public class TrianglePatternByNumbers {

	public static void main(String[] args) {
		pattern();
	}
	static void pattern() {
		int n = 5;
		for (int i = n;i >= 1;i--) {
			for (int j = i;j<= n;j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}