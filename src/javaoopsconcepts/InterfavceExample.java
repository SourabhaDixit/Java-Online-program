package javaoopsconcepts;
interface interface1{
	void m1();
}
public class InterfavceExample implements interface1 {

	public static void main(String[] args) {
		InterfavceExample obj = new InterfavceExample();
		obj.m1();

	}
	public void m1() {
		System.out.println("Abstract m1 is inside interface");
	}

}
