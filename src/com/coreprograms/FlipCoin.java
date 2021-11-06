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
				System.out.println(flipTimes);
				break;
			}
		}
	}

}
