package javaprogram;

public class Pattern2 {

	public static void main(String[] args) {
		// Program to print below pattern:
		// *
		// **
		// ***
		// ****
		// *****
		int x = 5;
		for(int i = 1; i <=x; i++){
			for(int j = 1; j <= i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
