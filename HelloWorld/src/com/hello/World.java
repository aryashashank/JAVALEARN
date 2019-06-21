package com.hello;

public class World {
	public static void main(String[] args) {

		System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
		System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
		System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
		System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));
	}


	public static Long toMilesPerHour(double kilometersPerHour) {

		return kilometersPerHour > 0 ? Math.round((kilometersPerHour/1.6)) : -1;

	}

	public static void printConversion(double kilometersPerHour) {

		System.out.println(kilometersPerHour+" km/h = "+toMilesPerHour(kilometersPerHour)+" mi/h");
	}

	public static void printMegaBytesAndKiloBytes(int kiloBytes) {
		if(kiloBytes < 0) {
			System.out.println("Invalid Value");
		}
		else {
			System.out.println(kiloBytes + " KB = "+kiloBytes/1024+" MB and "+(kiloBytes%1024)+" KB");
		}
	}

	public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
		if(barking) {
			if((hourOfDay < 8 && hourOfDay >=0) || (hourOfDay > 22 && hourOfDay <=23)) {

				return true;
			}
		}
		return false;
	}

	public static boolean isLeapYear(int year) {
		if(year<1 || year>9999) {
			return false;
		}
		if(year%4 == 0) {
			if(year%100 == 0) {
				if(year%400 == 0) {
					return true;
				}
			}
			else {
				return true;				
			}

		}
		return false;
	}

	public static boolean areEqualByThreeDecimalPlaces(double val1, double val2) {

		if(val1 > 0 || val2 > 0) {
			return (double)Math.floor(val1 * 1000d) / 1000d == (double)Math.floor(val2 * 1000d)/1000d;
		}
		else {
			return (double)Math.ceil(val1 * 1000d) / 1000d == (double)Math.ceil(val2 * 1000d)/1000d;
		}
	}
	
	public static boolean hasEqualSum(int sumable1, int sumable2, int comparator) {
		return sumable1 + sumable2 == comparator;
	}
public static boolean hasTeen(int val1, int val2, int val3) {
	return isTeen(val1) || isTeen(val2) || isTeen(val3);
}

public static boolean isTeen(int value) {
	return value > 12 && value < 20;
}

}
