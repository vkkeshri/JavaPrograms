package javaprogram;

import java.util.HashSet;

public class DuplicateNumbersInArray {

	public static void main(String[] args) {
		
		int [] arr={4,12,1,23,4,1,5,16,1};
		HashSet<Integer>h1 = new HashSet<Integer>();
		for(Integer i1 : arr){
			if(h1.add(i1) == false){
				System.out.println("Duplicates are "+i1);
			}
		}
	}

}
