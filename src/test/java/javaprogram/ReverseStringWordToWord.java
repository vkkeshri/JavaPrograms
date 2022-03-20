package javaprogram;

public class ReverseStringWordToWord {

	public static void main(String args[]){
		String str = "My name is vinod kumar keshri";
		String arr[] = str.split(" ");
		String str1 = "";
		
		for(int i=arr.length-1; i>=0; i--){
			str1 = str1+arr[i]+" ";
			
		}
		System.out.println(str1);
	}
}
