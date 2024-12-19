package objectOreientedProgramming;

public class AssigOverLoading {
	int a,b;
	void add() {
		System.out.println(a+b);
	}
	int add(int x,int y){
		return x+y;
	}
	
	int add(int x,int y,int z){
		return x+y+z;
	}
	double add(double x,double y){
		return x+y;
	}
}
