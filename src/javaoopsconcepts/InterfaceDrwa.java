package javaoopsconcepts;

interface draw{
	void pencil();
}
interface draw1{
	void paint();
}
public class InterfaceDrwa implements draw, draw1 {

	public static void main(String[] args) {
		InterfaceDrwa obj = new InterfaceDrwa();
		obj.pencil();
		obj.paint();

	}
	public void pencil() {
		System.out.println("Drawing circle with pencil");
	}
	public void paint() {
		System.out.println("Drawing and painting circle with pencil and brushes");
	}

}
