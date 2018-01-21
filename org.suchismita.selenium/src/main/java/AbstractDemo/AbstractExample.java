package AbstractDemo;

 abstract class AbstractExample {
	 int a = 10;
	 
	public void method(){
		System.out.println("common form");
	}
	
	public abstract void methodOne();
	abstract void methodTwo();
	public static void main(String args[]){
		//can not create object of abstract class
		/*AbstractExample ob = new AbstractExample();
		 * 
		ob.method();*/
	}
	
		
	

}
