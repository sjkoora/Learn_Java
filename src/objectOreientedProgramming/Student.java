package objectOreientedProgramming;

public class Student {
	//class variables
int  id;
String Sname;
String SchoolName ="gcc";//if all objects hv same data
char grad;
void PrintData() {
	System.out.println(id+" "+Sname+" "+grad+" "+SchoolName+" ");
}
void SetStudentData(int sid,String name,char gr){
	//local or mathod specific variables 
	id = sid;
	Sname=name;
	grad=gr;
}
//constructor 
//no return value no need void also
//it can or cannot take parameters
//it is used to intialize variable like storing data
Student(int sid,String name,char gr){
	id = sid;
	Sname=name;
	grad=gr;
}
}
