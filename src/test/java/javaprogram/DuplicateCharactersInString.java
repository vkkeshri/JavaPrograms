package javaprogram;

import java.util.HashSet;

public class DuplicateCharactersInString {

	public static void main(String[] args) {
		// Write a program to find duplicate character in a string.
		String s = "indonesiain";
		char[] ch = s.toCharArray();
		HashSet<Character> hash = new HashSet<Character>();
		for(Character c:ch){
			if(hash.add(c) == false){
				System.out.println("Duplicates is "+c);
			}
		}
	}

}
