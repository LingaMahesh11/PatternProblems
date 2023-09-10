package com.kn.PatternProblems;

public class Triangle_Hollow {

	public static void main(String[] args) {
		pattern();
	}
	static void pattern() {
		for (int i = 1;i <= 10;i++) {
			for (int j = 1;j <= 10;j++) {
				if (j == 1 || i == j || j == 10 || i + j == 11) {
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
