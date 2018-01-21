package String;


public class StringEqualsmethod {
	public static void main(String args[]){
	
	String str="HELLO";
	String str1 = "HELLO";
	String str2 = new String("hello");
	String str3 = new String("hellO");
	
	System.out.println(str2==str3);// indicates object :: As both have different address in memory
	System.out.println(str2.equals(str3));//indicates value::contents
	System.out.println(str==str1);
	System.out.println(str.equals(str1));

}
}
