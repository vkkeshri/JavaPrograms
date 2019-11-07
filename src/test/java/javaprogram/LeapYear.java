package javaprogram;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// Write a program to determine if an year is leap year.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year to check");
		int year = sc.nextInt();
		if((year%400 == 0) || (year%4 == 0) && (year%100 != 0)){
			System.out.println("Year "+year+" is a leap year");
		} else{
			System.out.println("Year "+year+" is not a leap year");
		}
	}

}
