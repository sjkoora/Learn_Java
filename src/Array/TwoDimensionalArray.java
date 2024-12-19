package Array;

//two/multidimentional array
//operations
//1.Declaring Array
//2.ADd values
//3.find size/length of array
//4.read single value
//5.read multiple values
public class TwoDimensionalArray {

	public static void main(String[] args) {
		// Approach1-if u know howmuch data to be store
		int a[][] = new int[3][2];
		// int[][] a=new int[3][2];
		// int [] a[] =new int[3][2]
		a[0][0] = 100;
		a[0][1] = 200;
		a[1][0] = 2100;
		a[1][1] = 300;
		a[2][0] = 400;
		a[2][1] = 1500;
//Approach-2
		int b[][] = { { 100, 200 }, { 290, 4534 }, { 5349, 393 }, { 394, 349 } };

		// Find size of array
		System.out.println("Length of rows " + a.length);
		System.out.println("Length of columns " + a[0].length);

//read single value
		System.out.println("Read Single value : "+a[2][1]);// 1500

//read Multiple values
//we need nested for loop for multiple iteraions
//classic forloop
		for (int r = 0; r <= 2; r++) {
			for (int c = 0; c <= 1; c++) {
				System.out.print("Values in array:" + a[r][c]+"  ");
			}
			System.out.println();
		}
	//a[r].length-1=first row number of columns	
		
		//enhanced forloop
	for(int x[]:b)	
	{
		for(int y:x) {
			System.out.print("multiple values with enhanced forloop : "+y+" ");
		}
		System.out.println();
	}
	}
}
