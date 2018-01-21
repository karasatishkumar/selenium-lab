package Program;

public class ConstructorTest {
int a;
String b;
public ConstructorTest() {
	System.out.println("a" +a +"b:" +b); //default constructor
}
public ConstructorTest(int c, int d){
	int a=c;
	int b=d;
	System.out.println("c:"+c+"d:"+d);
}
public static void main(String args[]){
ConstructorTest ob=new ConstructorTest();
ConstructorTest ob1=new ConstructorTest(10,20); // parameterized constructor
}
}
