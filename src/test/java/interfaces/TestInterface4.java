package interfaces;

public class TestInterface4 implements Showable{

	public void print(){
		System.out.println("print");
	}
	
	public void show(){
		System.out.println("show");
	}
	
	public static void main(String[] args) {
		TestInterface4 o = new TestInterface4();
		o.print();
		o.show();
	}
}