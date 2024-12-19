package strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Assignment11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String in = "2,345,6,5,64";
String a[] = in.split(",");
System.out.println(a.length);
ArrayList<Integer>  Even = new ArrayList<>();
ArrayList<Integer> Odd = new ArrayList<>();
for(int i = 0;i<a.length;i++) {
	String numStr = a[i].trim();
	int num = Integer.parseInt(numStr);
	if(num % 2==0) {
		Even.add(num);
	}else {
		Odd.add(num);
	}
	
}

System.out.println("Even = "+Even);
Collections.sort(Even);
System.out.println("Even After Sorting = "+Even);
System.out.println("Odd = "+Odd);
Collections.sort(Odd);
System.out.println("odd After Sorting = "+Odd);
	}

}
