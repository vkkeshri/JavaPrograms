package javaprogram;

public class ChangeString {

	public static void main(String[] args) {
		// Write a program to make the string “Name is Smith” as “Smith is Name”.
		String s = "Name is Smith";
		String temp;
		String [] arr=s.split(" ");
		temp=arr[0];
		arr[0]=arr[2];
		arr[2]=temp;
		for(String s1 : arr){
			System.out.print(s1+" ");
		}
	}

}
