package Program;

import java.util.Scanner;

public class CompareString {
public static void main(String args[]){
	
	Scanner sc = new Scanner(System.in);
	System.out.println("enter 1st string:");
	String s1 = sc.next();
	System.out.println("enter 2nd string:");
	String s2 = sc.next();
		if(s1.length()==s2.length()){
			for(int i=0;i<s1.length();i++){
				/*if(s1.charAt(i)!=s2.charAt(i)){
					//System.out.println("string:"+s1+"is not equals to string:"+s2);
				}*/
			}
			System.out.println("string:"+s1+"is equals:"+s2);
		}
		else{
			System.out.println("string:"+s1+"not equals:" +s2);
		
		}
	
		//with using equals method
		String str="hello";
		String str1="hello";
		if(str.equals(str1)){
			System.out.println("string is equal");
		}
			else{
				System.out.println("not equal");
				
			}
			}


}

