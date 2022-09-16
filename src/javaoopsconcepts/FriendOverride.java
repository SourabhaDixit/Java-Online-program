package javaoopsconcepts;

class Friend {
	void friendship() {
		System.out.println("My college friends are in same company.");
	}
}
public class FriendOverride extends Friend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FriendOverride obj = new FriendOverride();
		obj.friendship();

	}
	void friendship() {
		super.friendship();
		System.out.println("My college friends are also in testing team");
	}

}
