package com.kn.PatternProblems;

public class SleepedTriangle {

	public static void main(String[] args) {
		pattern();
	}
	static void pattern() {
		int k = 0;
		for (int i = 1;i <= 9;i++) {
			if (i <= 5) {
				k++;
			}
			else {
				k--;
			}
			for (int j = 1; j <= 5;j++) {
				if (j >= 6-k) {
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
