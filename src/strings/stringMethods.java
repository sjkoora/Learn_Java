package strings;

import java.util.Arrays;

public class stringMethods {

	public static void main(String[] args) {
		// String is predefined class so we can apply all methods to the variable
		//methods perform some task
		//String s = new String("welcome");here we created a string class object"s"
		String s= "Welcome";
		System.out.println(s);
		//different methods of string
		
		//1.Length()-return l. of String(no. of characters)
	int l=s.length();//we stored in "l"
	System.out.println(s.length());//7
	//if we dont hav variable thenapply methid on the value
	System.out.println("Welcome".length());//7
	
	//2.Concate-joinging strings (+,concate())
	String s2="java ";
	System.out.println(s+s2);//using + operator
	System.out.println(s.concat(s2));//using concate method .we can noin only 2 strings
	String s3="automation";
	//how to concate 3 strings ,we can do multiple concates
	System.out.println(s.concat(s2).concat(s3));
	System.out.println(s.concat(s2+s3));
	//example- if we dont hv variables .apply directly on values
	System.out.println("Welcome"+"to java");
	System.out.println("Welcome".concat("to java"));
	//we can use con method between sting n int it will concate only
	
	
	//3.trim()-removes spaces right n left side
	String s4 ="   How are you   ";
	System.out.println(s4);
	System.out.println("Before "+s4.length());
	
	System.out.println(s4.trim());
	
	System.out.println("After "+s4.trim().length());
	
	
	//4.charAt()-returns a charter from a string based on index
	
	String s5 ="GoodMorning";
	System.out.println(s5.charAt(0));
	
	
	//5.contains()-chks particular string is part of it r not
	//it always return boolean value(t/f)
	//they r case sensitive
	 String s6 ="My name is Swapna Koora.And you are Welcome to Automation Java";
	 System.out.println(s6.contains(s));
	 System.out.println(s6.contains("A"));
	 
	 //6.equals()/equalsIgnoreCase()-compare Strings
	 System.out.println(s.equals(s2));//false
	 System.out.println(s==s6);//false
	 System.out.println(s.equals("welcome"));//false
	 System.out.println(s.equalsIgnoreCase("welcome"));//true as it ignore case sensitive
	 
	 //7.Replace()-it will replace single/multiple(sequence)of charcters in a s string
	 String s7 ="Welcome to Selenium java Seleium Python c#";
	 //s7.replace('e', 'x');
	 System.out.println(s7.replace('e', 'x'));
	s.replace("Selenium","something" );
	System.out.println(s7.replace("Selenium","something" ));
	
	//8.SubString()-extract some portion of string from main string
	//Substring(Starting Index,ending Index)
	//starting index start from -0
	//ending index start from -1
	//this is for SubString() method
	//example
	s="Selenium";
	System.out.println(s.substring(1, 5));
	
	//9.toUpperCase()/toLowerCase()
	System.out.println(s7.toLowerCase());
	
	
	//10.split()-split in to multiple parts based on delimeter
	s="abc@gmail.com";
	//dalimeter-@,.,space etc.,
	String a[]=s.split("@");
	System.out.println(a[0]);//abc
	System.out.println(a[1]);//@gmail.com
	//example 1
	String Amt =" $12,34,56";
	
	System.out.println(Amt.replace("$", " "));
	System.out.println(Amt.replace("$", " ").replace(","," "));
	
	//ex-2
	s="abc,123@xyz";
	String A[]=s.split(",");
	System.out.println(Arrays.toString(A));
	System.out.println(A[0]);	
	System.out.println(A[1]);
	String st[]= A[1].split("@");
	System.out.println(Arrays.toString(st));
	System.out.println(st[0]);
	System.out.println(st[1]);
	
	//ex-3
	s ="xyz 123";
	String sn[]=s.split(" ");
	System.out.println(Arrays.toString(sn));
	//* % ^ & ( )-you cannot use as delimeters
	
	//ex-4
	String name = "John Kenedy";
	System.out.println(name.contains("john"));//false as case sensitive
	System.out.println(name.replace('J','j').contains("john"));//true
	System.out.println(name.toLowerCase().contains("john"));//true
	
}
}
