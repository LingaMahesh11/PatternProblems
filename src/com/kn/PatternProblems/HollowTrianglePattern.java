package com.kn.PatternProblems;

public class HollowTrianglePattern {

	public static void main(String[] args) {
		dimondPyramid();
	}

	static void dimondPyramid() {
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j<=5;j++) {
				if (i+j ==6  || i == 5 || j == 5) {
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