package strings;

public class StringVsStringBufferVsStringBulder {

	public static void main(String[] args) {
		//String-immutable
		String s="Welcome";
		s.concat("tojave");
		System.out.println("inStrings :"+s);
		//here we can't concat original value it is immutable
		
		//StingBuffer
		//append () method as java conact()
		StringBuffer sbf =new StringBuffer("Selenium ");
		sbf.append("to java");
		System.out.println("in StringBuffer class"+sbf);//mutable we can change value 
		
		//StingBuilder
				//append () method as java conact()
				StringBuffer sbb =new StringBuffer("Happy ");
				sbb.append("to learn java");
				System.out.println("In StringBuilder "+sbb);//mutable we can change value 
	}

}
