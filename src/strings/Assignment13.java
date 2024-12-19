package strings;

public class Assignment13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s = "Welcome";
		String a = "Swapna";
		String b = "Good";
		String c = "Morning";
		String reverse ="";
		System.out.println("1.Concate two strings: " +s+a);
		System.out.println("2.Length of b : " +b.length());
        System.out.println("3. "+c.charAt(0));
        System.out.println("4. "+a.contains("p"));
        System.out.println("5.Comparing welcome n swapna :"+s.equals(a));
        System.out.println("6.Ignoring Case sensitive : " +c.equalsIgnoreCase("morning"));
        System.out.println("7.REplace WElcome : "+s.replace("e", "c"));
        System.out.println("8.Welcome- "+s.toUpperCase());
        System.out.println("9.Good-"+b.toLowerCase());
        for(int i=s.length()-1;i>=0;i--) {
        	reverse=reverse + s.charAt(i);
        }
        System.out.println("Print Reverse String of WElcome :"+reverse);
        
	}

}
