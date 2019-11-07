package javaprogram;

public class Factorial {

	public static void main(String[] args) {
		// Write a program to find factorial of a number.
		int fact = 1, n = 5;
		for(int i=1; i<=n; i++){
			fact = fact*i;
		}
		System.out.println(fact);
	}
}
