package javaoopsconcepts;

public class StudentDetails {
	String name;
	int rollNo;
	String group;
	public static void main(String[] args) {
		
		StudentDetails std1 = new StudentDetails();
		std1.init("Sourabha", 11, "CSE");
		std1.display();
		StudentDetails std2 = new StudentDetails();
		std2.init("Pooja", 12, "CSE");
		std2.display();
	}
	void init(String name_temp, int rollNo_temp, String group_temp) {
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
