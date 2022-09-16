package javaoopsconcepts;

public class MainOverload {

	public static void main(String[] args) {
		System.out.println("Default main");
		main(12.4f);
		main(10);
	}
	
	public static void main(float f) {
		System.out.println(""+f);

	}
	public static void main(int i) {
		
		System.out.println(""+i);

	}


}
