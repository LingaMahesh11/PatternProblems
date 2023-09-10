package com.kn.PatternProblems;
import java.util.Scanner;
public class Pyramid {

	public static void main(String[] args) {
		pyramid();
	}
	static void pyramid() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scan.nextInt();
		for (int i = 1;i<=n;i++) {
			for (int j = i;j<=n;j++) {
				System.out.print(" ");
			}
			for (int j = 1;j<i;j++) {
				System.out.print("*");
			}
			for (int j = 1;j<=i;j++) {
				System.out.print("*");
			}
		System.out.println();
		scan.close();
		}
	}
}