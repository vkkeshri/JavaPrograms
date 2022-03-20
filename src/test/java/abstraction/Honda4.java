package abstraction;

public class Honda4 extends Bike{

	public void run(){
		System.out.println("Honda");
	}
	public static void main(String[] args) {
		Bike obj = new Honda4();
		obj.run();

	}

}
