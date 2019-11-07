package javaprogram;

public class SwappingNum {

	public static void main(String[] args) {
		// Write a program to swap 2 numbers without using temp variable.
		int a = 10;
		int b = 20;
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("Value of a is :"+a+", Value of b is :"+b);
	}

}
