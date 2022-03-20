package abstraction;

public class TestBank {

	public static void main(String[] args) {
		Bank b; 
		b = new Pnb();
		System.out.println("Rate of interest of Pnb is :"+b.getRateOfInterest()+" %");
		
		b = new Sbi();
		System.out.println("Rate of interest of Sbi is :"+b.getRateOfInterest()+" %");

	}

}
