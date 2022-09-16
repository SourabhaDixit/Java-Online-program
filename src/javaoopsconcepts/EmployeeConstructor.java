package javaoopsconcepts;

public class EmployeeConstructor {
	String empname;
	int empid;
	long empsalary;
	String empdesig;

	public static void main(String[] args) {
		EmployeeConstructor emp1 = new EmployeeConstructor("Sanvi",1, 800000,"Associate");
		emp1.display();
		EmployeeConstructor emp2 = new EmployeeConstructor("Sathvik",2, 500000,"Trainee");
		emp2.display();
		EmployeeConstructor emp3 = new EmployeeConstructor("Hemanth",3, 600000,"Associate");
		emp3.display();


	}
	//Constructor
	EmployeeConstructor(String empname_temp, int empid_temp, int empsalary_temp, String empdesig_temp) {
		empname = empname_temp;
		empid = empid_temp;
		empsalary = empsalary_temp;
		empdesig = empdesig_temp;
	}
	void display() {
		System.out.println("Employee name : "+empname);
		System.out.println("Employee ID : "+empid);
		System.out.println("Employee salary : "+empsalary);
		System.out.println("Employee designation : "+empdesig);
	}


}
