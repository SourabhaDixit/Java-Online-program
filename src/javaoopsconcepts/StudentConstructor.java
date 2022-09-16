package javaoopsconcepts;

public class StudentConstructor {
	String name;
	int rollNo;
	String group;
	public static void main(String[] args) {
		StudentConstructor std1 = new StudentConstructor("Sumant",1,"CSE");
		std1.display();
		StudentConstructor std2 = new StudentConstructor("Swasthik",2,"EC");
		std2.display();
	}
	//constructor 
	StudentConstructor(String name_temp, int rollNo_temp, String group_temp){
		name = name_temp;
		rollNo = rollNo_temp;
		group = group_temp;		
	}
	void display() {
		System.out.println("Name : "+name);
		System.out.println("Roll number : "+rollNo);
		System.out.println("Group : "+group);
	}
}
