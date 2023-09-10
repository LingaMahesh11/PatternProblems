package com.kn.PatternProblems;
import java.util.Scanner;
public class ReversePyramid {

	public static void main(String[] args) {
		reversepattern();
	}
	static void reversepattern() {
		Scanner scan = new Scanner (System.in);
		System.out.print("Enter a number ");
		int n = scan.nextInt();
		System.out.println();
		for (int i = 1;i<=n;i++) {
			for (int j = 1;j<=i;j++) {
				System.out.print("  ");
			}
			for (int j = i;j<n;j++) {
				System.out.print("* ");
			}
			for (int j = i;j<=n;j++) {
				System.out.print("* ");
			}
			
			System.out.println();
			scan.close();
		}
	}
}
