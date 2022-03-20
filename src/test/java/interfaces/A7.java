package interfaces;

public class A7 implements Printable, Showable{

	public void print(){
		System.out.println("Print");
	}
	
	public void show(){
		System.out.println("Show");
	}
	
	public static void main(String[] args) {
		A7 a = new A7();
		a.print();
		a.show();
	}

}
