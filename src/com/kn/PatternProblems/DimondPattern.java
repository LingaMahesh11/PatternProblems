package com.kn.PatternProblems;

public class DimondPattern {

	public static void main(String[] args) {
		pattern();
	}
	static void pattern() {
		int k = 0;
		for (int i = 1;i <= 7;i++) {
			if (i <= 4) {
				k++;
			}
			else {
				k--;
			}
			for (int j = 1;j <= 7;j++) {
				if (j >= 5-k && j <= k+3) {
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
