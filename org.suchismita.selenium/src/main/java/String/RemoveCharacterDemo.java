package String;

public class RemoveCharacterDemo {
	
	private static String convert(String str) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer(str);
			for(int i=0;i<sb.length();i++){
				if(sb.charAt(i)<97 || sb.charAt(i)>122) // for charecter a-b
				//if(sb.charAt(i)<48||sb.charAt(i)>57  // for integer  0-9
					{
					sb.deleteCharAt(i);
					i--;
				}
			}
		
		return sb.toString();
	}
	
	
	public static void main(String args[]){
		String str="hello123";
		str=convert(str);
		System.out.println(str);
		
	}

	

}
