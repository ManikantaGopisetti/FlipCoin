package com.coreprograms;

import java.util.Scanner;

public class FlipCoin {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("enter no of times to flip the coin = ");

		while (true) {
			int flipTimes = scan.nextInt();
			if (flipTimes < 1) {
				System.out.print("enter positive value greater than 0 :");
			} else {
				//System.out.println(flipTimes);
				int tailCount = 0;
				int headCount = 0;
				int flipCount = 0;

				for (int i = 0; i < flipTimes; i++) {

					double flip = Math.random();
					if (flip < 0.5) {
						// System.out.println("it is tails");
						tailCount++;
					} else {
						// System.out.println("it is heads");
						headCount++;

					}
					flipCount++;
				}
				System.out.println("percentage of tails=" + (tailCount / (double) flipCount) * 100 + "% and heads="
						+ (headCount / (double) flipCount) * 100 + "%");
				break;
			}
		}
	}

}
