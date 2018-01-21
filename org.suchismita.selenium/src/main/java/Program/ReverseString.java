package Program;

public class ReverseString {

	public static void main(String[] args) {
		String str = "Hello Hi";
		
		
		StringBuffer stb = new StringBuffer();
		
		stb.append(str);
		stb= stb.reverse();
		for(int i=0;i<stb.length();i++){
			System.out.print(stb.charAt(i));
			
			
		}

	}

}
