package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample3 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		for(String e:list){
			System.out.println(e);
		}
	}

}
