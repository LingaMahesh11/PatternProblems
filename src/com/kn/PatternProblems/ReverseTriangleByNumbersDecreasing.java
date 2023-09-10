package com.kn.PatternProblems;

public class ReverseTriangleByNumbersDecreasing {

	public static void main(String[] args) {
		pattern();
	}
	static void pattern() {
		for(int i = 9;i>=1;i--) {
			for (int j = 1;j<=i;j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
			
	}

}
