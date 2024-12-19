package objectOreientedProgramming;

public class AssigOverLoadingMain {

	public static void main(String[] args) {
	AssigOverLoading A = new 	AssigOverLoading();
	System.out.println(A.add(1,2));

	AssigOverLoading B = new 	AssigOverLoading();
	System.out.println(B.add(1,2,3));
	
	AssigOverLoading C = new 	AssigOverLoading();
	System.out.println(C.add(1.3,2.0));
	}

}
