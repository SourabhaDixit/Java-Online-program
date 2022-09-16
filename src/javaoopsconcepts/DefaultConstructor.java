package javaoopsconcepts;

public class DefaultConstructor {
	double x;
	float yf;
	int z;
	char m;
	short n;
	long p;
	byte q;
	boolean r;


	public static void main(String[] args) {
		DefaultConstructor obj = new DefaultConstructor();
		double a = obj.x;
		float b = obj.yf;
		int c = obj.z;
		char d = obj.m;
		short e = obj.n;
		long f = obj.p;
		byte g = obj.q;
		boolean h = obj.r;
		System.out.println(" "+a);
		System.out.println(" "+b);
		System.out.println(" "+c);
		System.out.println(" "+d);
		System.out.println(" "+e);
		System.out.println(" "+f);
		System.out.println(" "+g);
		System.out.println(" "+h);
	}
	
	
}


