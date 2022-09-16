package javaoopsconcepts;

public class EmployeeDetails {
	static String CompanyName = "Evry";
	static String CollegeName;
	String empname;
	int empid;
	long empsalary;
	String empdesig;
	

	public static void main(String[] args) {
		EmployeeDetails emp1 = new EmployeeDetails();
		emp1.init("Sanvi",1, 800000,"Associate");
		emp1.display();
		display1();
		EmployeeDetails emp2 = new EmployeeDetails();
		emp2.init("Sathvik",2, 500000,"Trainee");
		emp2.display();
		display1();
		EmployeeDetails emp3 = new EmployeeDetails();
		emp3.init("Hemanth",3, 600000,"Associate");
		emp3.display();
		display1();
	}
	static void display1(){
		CollegeName = "MITE";    
	    }
	void init (String empname_temp, int empid_temp, int empsalary_temp, String empdesig_temp) {
		empname = empname_temp;
		empid = empid_temp;
		empsalary = empsalary_temp;
		empdesig = empdesig_temp;
	}
 

    static {
        System.out.println("Welcome to TietoEvry");
		System.out.println();
		System.out.println("----------------------------------------------------------");
		System.out.println();
    }
	void display() {
		System.out.println("Employee Company Name : "+CompanyName);
		System.out.println("Employee name : "+empname);
		System.out.println("Employee ID : "+empid);
		System.out.println("Employee salary : "+empsalary);
		System.out.println("Employee designation : "+empdesig);
		System.out.println("Employee College Name : "+CollegeName);
		System.out.println();
		System.out.println("----------------------------------------------------------");
		System.out.println();
	}

}
