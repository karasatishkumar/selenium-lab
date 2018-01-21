package String;

public class CountNoOfOccurance {

	public static void main(String[] args) {
		String str = "java is a java";
		char c = 'a';
		int count= str.length() - str.replace("a", "").length();
		System.out.println("no of occurance:"+c+ "=" +count);

	}

}
