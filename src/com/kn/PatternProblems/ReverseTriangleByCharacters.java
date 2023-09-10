package com.kn.PatternProblems;

public class ReverseTriangleByCharacters {

	public static void main(String[] args) {
		pattern();
	}
	static void pattern() {
		for(int i = 5;i>=1;i--) {
			for (int j = 1;j<=i;j++) {
				System.out.print((char)(70-j) + " ");
			}
			System.out.println();
		}
			
	}

}
