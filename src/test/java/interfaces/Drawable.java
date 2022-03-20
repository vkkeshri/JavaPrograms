package interfaces;

public interface Drawable {
	void draw();
	default void msg(){
		System.out.println("msg");
	}
	static int cube(int x){
		return x*x*x;
	}
}
