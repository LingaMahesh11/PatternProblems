package com.kn.PatternProblems;
import java.util.Scanner;
public class ReversedPyramid {
	public static void main(String[] args) {
		patterns();
	}
	static void patterns() {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter a number ");
		int n =scan.nextInt();
		for (int i = n;i >= 1;i--) {
			for (int j = n;j >i;j--) {
				System.out.print(" ");
			}
			for(int k = 1;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		scan.close();
	}
}