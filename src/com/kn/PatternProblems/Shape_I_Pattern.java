package com.kn.PatternProblems;
import java.util.Scanner;
public class Shape_I_Pattern {

	public static void main(String[] args) {
		
		i_Shape();
	}
	static void i_Shape() {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter a number ");
		int n = scan.nextInt();
		
		for (int i = 1;i<=n;i++) {
			for (int j = 1;j <= n;j++) {
				if (i == 1 || j == n/2+1 || i == n) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
					
				}
			}
		System.out.println();
		}
		scan.close();
	}

}
