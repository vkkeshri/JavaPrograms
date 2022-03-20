package javaprogram;

public class NumberSeriesWithoutLoop {

	public static void main(String[] args) {
		
		int num = 0;
		print_without_loop(num);
	}
	public static void print_without_loop(int num){
		if(num<=15){
			System.out.println(num);
			print_without_loop(num+1);
		}
	}
}
