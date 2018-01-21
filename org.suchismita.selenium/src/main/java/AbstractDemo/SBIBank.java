package AbstractDemo;

public class SBIBank extends AbstractExample {

	@Override
	public void methodOne() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void methodTwo() {
		// TODO Auto-generated method stub
		
	}
	
public void methodFour(){
	System.out.println("sbi interest is 8%");
	
}
public static void main(String args[]){
	SBIBank obj2 = new SBIBank(); {
		
		
		
	
	obj2.method();
	obj2.methodOne();
	obj2.methodTwo();
	//obj2.methodThree();
	obj2.methodFour();
	System.out.println(obj2.a);
	
	AbstractExample obj1 = new SBIBank();
	obj1.method();
	}
}
}
