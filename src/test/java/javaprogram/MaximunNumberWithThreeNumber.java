package javaprogram;

public class MaximunNumberWithThreeNumber {

	public static void main(String[] args) {
		//WAP to find out a maximum number with three numbers are given"
		int x = 100;
		int y = 200;
		int z = 300;
		if(x>y && x>z){ //short circut operator
			System.out.println("x is the greatest");
		}else if(y>z){
			System.out.println("y is greatest");
		}else{
			System.out.println("z is greatest");
		}
	}
}
