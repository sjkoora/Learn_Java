package Assignments;

public class P18 {

	public static void main(String[] args) {
		// Reverse  array
		int []a= {1,4,6,8,8,7};
	int	reverse ;
	System.out.println("This is original array: ");
	for(int x:a) {
	System.out.print( x+" ");
	}
	System.out.println("\n This is Reverse array: ");
	for(int y=a.length -1;y>=0;y--) {
		System.out.print(a[y]+" " );
	}
	}

}
