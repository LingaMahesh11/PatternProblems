package com.kn.PatternProblems;

public class Pattern_X_Shape {

	public static void main(String[] args) {
		pattern();
	}
	static void pattern() {
		for (int i = 1;i <= 5;i++) {
			
			for (int j = 1;j <= 5;j++) {
				if (j == i || j == 6-i) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
		System.out.println();
		}
	}
	

}
