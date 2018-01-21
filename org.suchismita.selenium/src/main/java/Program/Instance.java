package Program;

public class Instance {
int a;
public void show(){
	System.out.println(a);
}

public static void main(String args[]){
	int b=2;
	System.out.println(b);
	Instance ob = new Instance();
	ob.show();	
	}
	
}