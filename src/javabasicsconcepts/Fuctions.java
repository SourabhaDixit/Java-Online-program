package javabasicsconcepts;

public class Fuctions {

	public static void main(String[] args) {
		Fuctions obj = new Fuctions();
		int total_sum= obj.add(10,20);
		int total_difference = obj.sub(20,10);
		System.out.println("sum = "+total_sum+", Difference = "+total_difference);
		obj.div(7,2);
		obj.mul(4,5);

	}
	int add(int a, int b) {
		return(a+b);
	}
	int sub(int x, int y) {
		return(x-y);
	}
	void div(int p, int q) {
		int division = (p/q);
		System.out.println("Division = "+division);
	}
	void mul(int t, int s) {

		int multi = t*s;
		System.out.println("Multiplication = "+multi);
	}
}
