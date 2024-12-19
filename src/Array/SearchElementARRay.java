package Array;

public class SearchElementARRay {

	public static void main(String[] args) {
		// (linear search)
		int[] a = { 1, 4, 54, 67, 889 };

		int search_element = 54;
		boolean status =false; //false-not foumd,true-found
		for(int i=0;i<a.length;i++) {
			//System.out.println(a[i]);
			if(a[i]==search_element) {
				System.out.println("Element Found");
				status=true;
				break;
			}
			
//			//enhanced forloop
//			for(int x:a) {
//				if (x==search_element) {
//					System.out.println("Element Found");
//					status=true;
//					break;
//				}
//			}
					}
		if(status==false) {
			System.out.println("Element  not Found");
		}

	}

}
