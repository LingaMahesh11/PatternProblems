package com.kn.PatternProblems;

public class PatternProblem_8 {

	public static void main(String[] args) {
		pattern();
	}
	static void pattern() {
		for (int i = 1;i<=5;i++) {
			for (int j = 5;j >= i;j--) {
				System.out.print((char)(64+i) + " ");
			}
			System.out.println();
		}
	}

}