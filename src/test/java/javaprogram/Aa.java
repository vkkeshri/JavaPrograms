package javaprogram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Aa {
	public static void main(String args[]){
		int [] arr={12,2,14,7,32,18,23,22,11};
		
		int temp;
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<(arr.length)-1; j++){
				if(arr[j]>arr[j+1]){
					temp = arr[j];//12
					arr[j] = arr[j+1];//arr[2]
					arr[j+1] = temp;//arr[2]=12
				}
			}
		}
		System.out.println(arr[(arr.length)-2]);
	}
}
