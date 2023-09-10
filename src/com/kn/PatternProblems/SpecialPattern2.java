package com.kn.PatternProblems;

public class SpecialPattern2 {

	public static void main(String[] args) {
		pattern();
	}
	static void pattern() {
		int n = 5;
		for(int i = 1;i<=n;i++) {
			for(int j = 1;j <=n ;j++) {
				if (i+j <= 6) {
					System.out.print(j + " ");
				}
				else {
					System.out.print(" ");
				}
			}
		System.out.println();
		}
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
