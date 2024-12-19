package strings;

public class Assig9 {

	public static void main(String[] args) {
		// Remove Duplicate
		String s = "Programming";
		String duplicate = "";
		String CharDup = ""  ;
		int duplicateCount = 0;
		System.out.println("input : " + s);
		int l = s.length();
		System.out.println(l);

		for (int i = 0; i < l; i++) {
			char a = s.charAt(i);
			//System.out.println(a);
			if (duplicate.indexOf(a) == -1) {
				duplicate += a;
			}else {
				if(!CharDup.isEmpty()) {
					CharDup +=",";
				}
				CharDup +=a;
				
		}
		}		
		System.out.println("String after remobing duplicates"+duplicate);
		
		int newL = duplicate.length();
		System.out.println("New length of the String : " +newL );
		System.out.println("Duplicat Count:" +(duplicateCount = l - newL));
		
		System.out.println("Duplicate characters : " +CharDup);
		}

}
