package javaprogram;

public class Armstrong {

	public static void main(String[] args) {
		// Armstrong number is a number that is equal to the sum of cubes of its digits for example
		// 0, 1, 153, 370, 371, 407 etc.
		int c = 0, a, temp;
		int n=153;//It is the number to check armstrong
		temp = n;
		while(n > 0){
			a = n % 10;
			n = n / 10;
			c = c + (a * a * a);
		}
		if(temp == c){
			System.out.println("Armstrong number");
		} else {
			System.out.println("Not armstrong number");
		}
	}

}
