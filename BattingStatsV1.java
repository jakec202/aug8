package com.battingStats;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BattingStatsV1 {

	Scanner scan = new Scanner(System.in);
	private int sin, doub, trip, home, hits, bases, atbat;
	private double average;
	private double slugging;

	public void getStats(String name) {

		System.out.print("Times at bat: ");
		atbat = scan.nextInt();
		while (atbat < 0) {
			System.out.println("Please enter a positive at bat value: ");
			atbat = scan.nextInt();
		}
		;
		System.out.print("Single hits: ");
		sin = scan.nextInt();
		while (sin < 0) {
			System.out.println("Please enter a positive single value: ");
			sin = scan.nextInt();
		}
		;
		System.out.print("Double hits: ");
		doub = scan.nextInt();
		while (doub < 0) {
			System.out.println("Please enter a positive double value: ");
			doub = scan.nextInt();
		}
		;
		System.out.print("Triple hits: ");
		trip = scan.nextInt();
		while (trip < 0) {
			System.out.println("Please enter a positive triple value: ");
			trip = scan.nextInt();
		}
		;
		System.out.print("Homeruns: ");
		home = scan.nextInt();
		while (home < 0) {
			System.out.println("Please enter a positive homerun value: ");
			home = scan.nextInt();
		}
		;
	}

	public Object calcAvg() {

		DecimalFormat df = new DecimalFormat("#.###");
		df.setMinimumFractionDigits(3);

		hits = sin + doub + trip + home;
		if (hits > atbat) {

			return "You cannot have more hits than at bats";
		} else {
			average = ((double) hits / (double) atbat);
			return df.format((double) Math.round((average) * 1000d) / 1000d);
		}
	}

	public Object calcSlug() {

		DecimalFormat df = new DecimalFormat("#.###");
		df.setMinimumFractionDigits(3);

		bases = (sin * 1) + (doub * 2) + (trip * 3) + (home * 4);
		if (hits > atbat) {

			return "Too many bases! You have more hits than at bats";
		} else {
			slugging = ((double) bases / (double) atbat);
			return df.format((double) Math.round((slugging) * 1000d) / 1000d);
		}

	}

	public void printAll(String name) {
		System.out.println("Player statistics for " + name + ":");
		System.out.println("Single hits: " + sin);
		System.out.println("Double hits: " + doub);
		System.out.println("Triple hits: " + trip);
		System.out.println("Homerun: " + home);
		System.out.println("Times at bat: " + atbat);
		System.out.println("Total hits: " + hits);
		System.out.println("Total bases:" + bases);
		// System.out.println("Baseball average: " + (int)average);package
		// com.battingStats;
	}
}
