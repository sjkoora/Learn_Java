package Assignments;

public class P14 {

	public static void main(String[] args) {
		//Sum of Elements of array
		int a[ ]= new int[5];
		int sum =0;
		a[0]=1;
		a[1]=3;
		a[2]=2;
		a[3]=10;
		a[4]=11;
		System.out.println("size of array : "+a.length);
		
		for(int x:a) {
			sum =sum + x;
			//System.out.println("values in b :" +x)
		}
		System.out.println("Sum of elements : "+sum);
	}

}
