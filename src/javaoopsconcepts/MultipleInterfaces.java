package javaoopsconcepts;
interface inter1{
	void m1();
}
interface inter2 {
	void m2();
}

public class MultipleInterfaces implements inter2, inter1 {

	public static void main(String[] args) {
		MultipleInterfaces obj = new MultipleInterfaces();
		obj.m1();
		obj.m2();

	}
	public void m1() {
		System.out.println("Abstract method 1 present inside interface 1");
	}
	public void m2() {
		System.out.println("Abstract method 2 present inside interface 2");
	}

}
