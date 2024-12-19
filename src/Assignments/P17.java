package Assignments;

public class P17 {

	public static void main(String[] args) {
		// find the largest n smallest element in array
		
 int a[] = {5,4,67,889,566};
 int largest=0;
 int smallest=a[0];

 for(int x:a) {
	 if (x > largest) {
		 largest = x;
	 }
	 if(x < smallest) {
		 smallest = x;
	 }
 }
 System.out.println("LarestNumber is : "+largest);
 System.out.println("smallest Number is : "+smallest);	 
 
	}

}

