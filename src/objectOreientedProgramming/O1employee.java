package objectOreientedProgramming;

public class O1employee {
	// we can/canot hav main method in creating class
	// but we need main method to run the class
	// variable
	int eid;
	String ename;
	String job;
	int Salary;

	// Methods- we all hv to c reate return type for method if it returns output
	// if doesnt retun output we can add void as return type
	// ()-no parameters in it
	void display() {
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(job);
		System.out.println(Salary);
	}

/*method
	public static void main(String[] args) {
		O1employee emp1 = new O1employee();// object
		// emp1 can have copy of variables and display method
		emp1.eid = 101;
		emp1.job = "manager";
		emp1.ename = "J";
		emp1.Salary = 23434;
		emp1.display();
//creating new object
		O1employee emp2 = new O1employee();
		emp2.eid = 102;
		emp2.job = "Developer";
		emp2.ename = "s";
		emp2.Salary = 3000;
		emp2.display();
	}*/
	

}
