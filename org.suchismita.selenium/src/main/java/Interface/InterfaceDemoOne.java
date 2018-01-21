package Interface;

public class InterfaceDemoOne implements InterfaceDemo {

	@Override
	// implement method from interface class in class
	public void Example() {
		System.out.println("1st interfaceDemo class-example method use");

	}

	@Override
	public void ExampleOne() {
		System.out.println("1st interfaceDemo class-exampleone method use");

	}

	public void ExampleTwo() {
		System.out.println("used child class method-exampletwo method");
	}

	// create object of child class
	// we canot create object of interface
	public static void main(String args[]) {
		int x = 20;// x value is not used because in interface value is not
					// changed it's work like final
		InterfaceDemoOne obj = new InterfaceDemoOne();
		obj.Example();
		obj.ExampleOne();
		obj.ExampleTwo();
		System.out.println(obj.x);

	}

}
