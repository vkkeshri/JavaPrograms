package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList5 {

	public static void main(String[] args) {
		Student s1 = new Student(11, "Ishan", 7);
		Student s2 = new Student(12, "Vinod", 40);
		Student s3 = new Student(13, "Kumar", 23);
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		Iterator itr = al.iterator();
		while(itr.hasNext()){
			Student st = (Student)itr.next();
			System.out.println(st.rollno+" "+st.name+" "+st.age);
		}
	}

}
