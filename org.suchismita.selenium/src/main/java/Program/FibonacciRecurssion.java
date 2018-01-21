package Program;

public class FibonacciRecurssion {
static int n1=0,n2=1,n3=0;
public static void Recurrsion(int count){
	if(count>0){
	n3=n1+n2;
	n1=n2;
	n2=n3;
	System.out.println("n3:"+n3);
	Recurrsion(count-1);
}
}
public static void main(String args[]){
	int count=7;
	System.out.println("n1:" +n1+"n2:" + n2);
	Recurrsion(count-1);
}
}
