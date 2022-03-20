package javaprogram;

public class ReverseString {

	public static void main(String[] args) {
		
		String str = "My name is vinod";
		int strCount = str.length();
		System.out.println(strCount);
		String str1 = "";
		
		for(int i=strCount-1; i>=0; i--){
			str1 = str1+str.charAt(i);
		}
		System.out.println(str1);
	}

}
