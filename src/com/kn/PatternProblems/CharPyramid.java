package com.kn.PatternProblems;

public class CharPyramid {

	public static void main(String[] args) {
		charDimond();
	}
	static void charDimond() {
		int n = 5;
		for (int i = 1;i<=n;i++) {
			for (int j = i;j<=n;j++) {
				System.out.print("  ");
			}
			for (int j = 1;j<i;j++) {
				System.out.print((char)(64+i)+ " ");
			}
			for (int j = 1;j<=i;j++) {
				System.out.print((char)(64+i) + " ");
			}
			
		System.out.println();
		}
		
		
	}

}
