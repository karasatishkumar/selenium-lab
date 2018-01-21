package String;

public class StringReverse {
	public static void main(String args[]){
		String str = "sus";
		//using stringbuffer
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());
		String str1 = " ";
	
		//iterative method
		
	
		
	char[] ch = str1.toCharArray();
		for(int i=ch.length-1;i>=0;i--){
			str1=str1+ch[i];
			
		}
			
		System.out.println(str1);
			
			if(str.equals(str1)){
				System.out.println("pall");
				
			}
			else{
				System.out.println("not");
	}
	
		}
			
}

