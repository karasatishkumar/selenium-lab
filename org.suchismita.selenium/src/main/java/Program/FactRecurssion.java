package Program;

public class FactRecurssion {
	static int fact(int n){
		if(n==0)
		{
			return 1;
		}
		else
			return(n*fact(n-1));
	}
public static void main(String args[]){
	int i, fact1=1;
	int no=5;
	 fact1 = fact(no);
	 System.out.println("factorial:" +fact1);
}

}
