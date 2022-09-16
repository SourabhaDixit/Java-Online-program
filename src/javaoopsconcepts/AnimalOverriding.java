package javaoopsconcepts;
//Super class
class Animal
{
	void animalss() {
		System.out.println("Talk about animal");
	}
}


public class AnimalOverriding extends Animal{
	public static void main(String[] args) {
		AnimalOverriding obj = new AnimalOverriding();
		obj.animals();

	}
	//sub class
	void animals() {
		super.animalss();
		System.out.println("Dogs can walk and run");
	}

}
