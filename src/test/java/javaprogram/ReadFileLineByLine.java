package javaprogram;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileLineByLine {

	public static void main(String[] args) throws IOException {
		// Write a program to read file line by line.
		String s = null;
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\VDK\\Desktop\\testcsv.csv"));
		while((s=br.readLine())!=null){
			System.out.println(s);
		}
	}
}
