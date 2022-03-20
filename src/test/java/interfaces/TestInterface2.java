package interfaces;

public class TestInterface2 {

	public static void main(String[] args) {
		Bank b = new SBI();
		System.out.println(b.rateOfInterest());
	}

}
