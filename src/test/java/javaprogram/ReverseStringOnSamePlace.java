package javaprogram;

public class ReverseStringOnSamePlace {

	public static void main(String args[]){
		String str = "My name is vinod kumar keshri";
		String arr[] = str.split(" ");
		
		for(int i=0; i<arr.length; i++){
			StringBuilder str2 = new StringBuilder();
			str2.append(arr[i]);
			System.out.print(str2.reverse()+" ");
		}
	}
}