package objectOreientedProgramming;

public class Adder {
int a=10,b=20;
void sum()//1.names are same
{
	System.out.println(a+b);
}
void sum(int x,int y)//2.no. of parametrs are different 
{
	System.out.println(x+y);
}
void sum(int x,double y)//3.no. of parametrs are same so data type r different
{
	System.out.println(x+y);
}
void sum(double x,double y)//4.no. of parametrs and data type  r same then order of datatypes shld be different
{
	System.out.println(x+y);
}
void sum(int a ,int b,int c)//5
{
	System.out.println(a+b+c);
}
}
