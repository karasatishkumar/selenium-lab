package String;

public class SeachString {

	public static void main(String[] args) {
		String str = "hello suchi smita";
		int intindex = str.indexOf("smita");
		if(intindex==-1){
			System.out.println("hello not found");
			
		}
		else{
			System.out.println("found hello at index:" +intindex);
		}
		
	
int positionindex =str.indexOf("suchi", 6);
System.out.println("index of suchi after 6 is:" + positionindex);

	int lastindex = str.lastIndexOf("suchi");
	System.out.println("last occorance of index:" +lastindex);
}
}