package javaoopsconcepts;

public class SubOverload {


	public static void main(String[] args) {

		SubOverload obj = new SubOverload();
		obj.add(80,20);
		obj.add(80.89,90.78,70.76);
		obj.add(12.1f,15.8f);			
		}
		
		void add(int x, int y) {
			System.out.println(x-y);
		}
		void add(double a, double b, double c) {
			System.out.println((a-b)-c);
		}
		void add(float x, float y) {
			System.out.println(x-y);
		}

	

}
