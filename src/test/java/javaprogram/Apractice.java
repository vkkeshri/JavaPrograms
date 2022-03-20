package javaprogram;

public class Apractice {

	public static void main(String args[]){
		
		String s = "My Name is Vinod";
		int strCount = s.length();
		
		for(int i=0; i<=strCount-1; i++){
			for(int j=i+1; j<=strCount-1; j++){
				if(s.charAt(i) == s.charAt(j)){
					System.out.println("Duplicate character is : "+s.charAt(i));
				}
			}
		}
	}
}