package Array;

import java.util.Arrays;

public class Reverseorder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[ ]= {1,2,3,4,5,6,7,8};

System.out.println("original Array :"+Arrays.toString(a));
for(int i=a.length-1;i>0;i--) {
	
	System.out.print(a[i]+",");
}
	}

}
