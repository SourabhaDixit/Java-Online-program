package javaoopsconcepts;

abstract class car{
	abstract void run();
	void gear() {
		System.out.println("Maruti car has 5 geras");
	}
}
public class MarutiAbstract extends car {
	

	public static void main(String[] args) {
		MarutiAbstract obj = new MarutiAbstract();
		obj.run();
		obj.gear();

	}
	void run() {
		System.out.println("Maruti car is running safely");
	}

}
