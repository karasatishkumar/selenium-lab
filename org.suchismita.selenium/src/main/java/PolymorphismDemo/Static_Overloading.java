package PolymorphismDemo;

public class Static_Overloading {
	//same method name with different signature

	public void show(int a){
			System.out.println("suchi");;
			System.out.println(a);
		}
	public void show(int a,int b){
	System.out.println("smita");
	System.out.println(a+b);

	}
public void show(double d){
	System.out.println("suchismita");
	System.out.println(d);
}
public static void main(String args[]){
	Static_Overloading so=new Static_Overloading();
	so.show(10);
	so.show(3, 4);
	so.show(2.5);
}
}
