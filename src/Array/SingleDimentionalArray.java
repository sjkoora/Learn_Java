package Array;
//Single dimentional array
		//operations
		//1.Declaring Array
		//2.ADd vslues
		//3.find size/length of array
		//4.read single value
		//5.read multiple values
public class SingleDimentionalArray {

	public static void main(String[] args) {
		//declaring array
//Aproach 1
		//if u know number of vales to be stored
		int a[]= new int[5];
		//assign values to array
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;
//Approach 2-we can declare n assign in single line
		//only if u  dont know  size-dynamic
		int b[]= {100,200,300,};
		
		//find length of an array
		System.out.println(a.length);
		System.out.println(b.length);
		
		//how to read single value
		System.out.println(a[3]);
		
		//looping statement for reading all the values
		//we use for loop for array
		//calssic for loop
		//for(int i=0;i<=a.length-1;i++)as it will return one more
		//i<=4,i=5,i<a.length,i<=a.length-1
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		//foreach loop/enhanced loop -we use with arrays and collections
		for(int x:b)
		{
			System.out.println("values in b :" +x);
		}
		
		
	}

}
