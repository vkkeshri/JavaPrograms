package collection;

import java.util.ArrayList;

public class ArrayListExample4 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.set(2, "D");
		for(String e:list){
			System.out.println(e);
		}
	}

}
