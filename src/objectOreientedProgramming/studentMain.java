package objectOreientedProgramming;

public class studentMain {

	public static void main(String[] args) {
	/*	Student stu1 = new Student();
		stu1.id = 101;//these are oject ref variable-store data in variable
		stu1.grad = 'A';
		stu1.Sname = "Swa";
		
		stu1.PrintData();
		
		Student stu2 = new Student();
		stu2.id = 101;
		stu2.grad = 'A';
		stu2.Sname = "Soiue";
		stu2.PrintData();
		
		//using methos data storage
		Student stu3 = new Student();
		stu3.SetStudentData(122, "Dal", 'A');
		stu3.PrintData();
		*/
		//using constructor
		Student stu4 = new Student(123,"ddf",'d');
		stu4.PrintData();
	}

}
