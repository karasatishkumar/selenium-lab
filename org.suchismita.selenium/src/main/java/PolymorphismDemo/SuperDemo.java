package PolymorphismDemo;

class Parent{
	int x=10;
	public void show(){
		System.out.println("use super in a method");
	}
}
class child extends Parent{
	int y=20;
	int z=30;
	public void show(){
		System.out.println("print child class");
		System.out.println(y);
		System.out.println(this.z);
		System.out.println(super.x);
		super.show();
		
	}
}
public class SuperDemo {
	
	public static void main(String args[]){
		Integer a=7;
		
		String str=a.toString();
		
		System.out.println(str);
		child ch =new child();
		ch.show();
		
		
	}

}
