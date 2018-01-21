package AbstractDemo;

public class HDFCBank extends AbstractExample {

	@Override
	public void methodOne() {
		System.out.println("abstract method used");
		
	}

	@Override
	void methodTwo() {
		// TODO Auto-generated method stub
		
	}
	public void methodThree(){
		System.out.println("hdfc interest 10%");
	}
    public static void main(String[] args) {
    	
    	
	HDFCBank obj = new HDFCBank();
	obj.method();
	obj.methodOne();
	obj.methodTwo();
	obj.methodThree();
	System.out.println(obj.a);
	
	AbstractExample obj1 = new HDFCBank();
	obj1.method();
	}

}
