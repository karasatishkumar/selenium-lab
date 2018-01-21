package Program;

public class ConstructorOver {
	int id;
    int age;
    String name;
    public ConstructorOver(int a, int b) {
    	id=a;
    	age=b;
    	System.out.println("id:" +id +","+ "age:" +age);
		
	}
    public ConstructorOver(int a, int b, String c){
    	id=a;
    	age=b;
    	name=c;
    	System.out.println("id:" +id +"age:" +age+"name:" +name);
    }
    public static void main(String args[]){
    	ConstructorOver obj = new ConstructorOver(101, 20);
    	ConstructorOver obj1 = new ConstructorOver(102, 25,"Suchi");
    }

}
