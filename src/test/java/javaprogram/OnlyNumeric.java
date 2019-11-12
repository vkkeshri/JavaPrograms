package javaprogram;

public class OnlyNumeric {

	public static void main(String[] args) {
		// Write a program to extract numeric values from a string.
		String s = "Struggle12for5andind829";
		String s2 = "";
		String arr[] = s.split("[a-zA-Z]");
		for(String s1 : arr){
			s2 = s2+s1.trim();
		}
		char[] ch = s2.toCharArray();
		for(Character c : ch){
			System.out.print(c+",");
		}
	}

}
