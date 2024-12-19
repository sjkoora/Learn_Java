package objectOreientedProgramming;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
	}

}
