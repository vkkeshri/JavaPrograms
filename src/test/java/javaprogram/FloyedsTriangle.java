package javaprogram;

import java.util.Scanner;

public class FloyedsTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a range");
		int x = sc.nextInt();
		int p = 1;
		for(int i = 1; i <= x; i++ ){
			for(int j = 1; j <= i; j++){
				System.out.print(p);
				p++;
			}
			System.out.println();
		}
		sc.close();
	}

}
