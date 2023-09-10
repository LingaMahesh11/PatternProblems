package com.kn.PatternProblems;
import java.util.Scanner;
public class NumberIncreasingPattern {

	public static void main(String[] args) {
		patterns();
	}
	
	static void patterns() {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter a number ");
		int n =scan.nextInt();
		int num = 1;
		for (int i = 1;i <= n;i++) {
			for (int j = 1;j <= i;j++) {
				System.out.print(num + " ");
				num++;
			}
			System.out.println();
		}
		scan.close();
	}

}
