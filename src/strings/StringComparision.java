package strings;

public class StringComparision {

	public static void main(String[] args) {
		// case1
String s1 = "WElcome";
String s2 = "WElcome";

System.out.println(s1==s2);//true
System.out.println(s1.equals(s2));//true
//no difference if u create variable like s1,s2

//case2
String s3 = new String("WElcome");
String s4 = new String("WElcome");

System.out.println(s3==s4);//false//used to compare objects
System.out.println(s3.equals(s4));//true//used to compare value of objects
//we see diff only when we create strings as an object only
//==as they r two different objects 
//equals methods see value in objects as it sees welcome

//case 3
String s5 = "abc";
String s6 = new String("abc");
System.out.println(s5==s6);//false as s6 is new object
System.out.println(s5.equals(s6));//true

//case 4
String s7 ="abc";
String s8 = new String("abc");
String s9 = s8;
System.out.println(s7==s8);//false as s8 is new object
System.out.println(s1.equals(s8));//equals compares value so true
System.out.println(s8==s9);//true-as objects are same/equal
System.out.println(s8.equals(s9));//true as valueis same
System.out.println(s7==s9);//false
System.out.println(s7.equals(s9));//true
//when ever use new key word use "equals method"

	}

}
