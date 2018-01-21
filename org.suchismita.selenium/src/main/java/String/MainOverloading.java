package String;

public class MainOverloading {
	public  void main(String ar){
		int a=1;
		System.out.println("overload concept");
		System.out.println(a);
		
	}
	
	
	public static  void main(int a, int b){
		
		System.out.println("main overload");
		int c = a+b;
		System.out.println(c);
	}
		public static void main(String args[]){
			System.out.println("2nd main");
			MainOverloading mov = new MainOverloading();
			main(10,20);
			
		
		
		
		
	}

}
