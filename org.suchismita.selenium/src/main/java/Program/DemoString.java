package Program;

import net.sourceforge.htmlunit.corejs.javascript.regexp.SubString;

public class DemoString {
	public static void main(String args[]) {
		/*
		 * int[] a = {1,2,3,5,7};
		 * 
		 * 
		 * 
		 * //int arr[]= new int[4]; for(int i=2;i<4;i++)
		 * 
		 * System.out.println(a[i]);
		 */

		String str = "suchismita";
		char[] a = str.toCharArray();
		for (int i = 4; i <= 9; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("another way:" + " ");
		// another way to print using substring method
		String str1 = "suchismita";

		System.out.println(str1.substring(4, 10));
		System.out.println(str1.substring(str1.length()-4));
		
	}

}
