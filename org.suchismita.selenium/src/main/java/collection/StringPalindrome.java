package collection;

import java.util.Scanner;



public class StringPalindrome {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string:");
		String str= sc.nextLine();
		//sc.close();
		String strrev="";
		int length = str.length();
		//char[] ch =str.toCharArray();
				for(int i=length-1;i>=0;i--)
				strrev=strrev+str.charAt(i);
				
				//System.out.println("strrev:"+strrev);
				if(str.equals(strrev))
					System.out.println(str+":string is pallendrom");
				else
					System.out.println(str+":not pallendrom");
	}
}
				
				
				
	
		
				
				
			
	


