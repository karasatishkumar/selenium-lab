package Program;

import javafx.scene.Parent;

	class parent{
		int a=10;
		public void show(){
			System.out.println("hi");
		}
	}
	class child extends parent{
		public void show(){
			System.out.println("hello");
			System.out.println(super.a);
			super.show();
		}
		
	}
	public class Overloading_Demo {
	public static void main(String args[]){
		child obj = new child();
		obj.show();
		
		/*parent obj1= new child();
		obj1.show();*/
		
		
        
		/*parent obj1= new parent();
		obj1.show();*/
		
	}

}
