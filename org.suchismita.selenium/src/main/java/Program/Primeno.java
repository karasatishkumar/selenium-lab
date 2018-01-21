package Program;

public class Primeno {

	public static void main(String[] args) {
		int n, m=0, i, flag=0;
		n=7;
		m=n/2;
		for(i=2;i<m;i++){
			if(n%i==0){
				System.out.println("no is not prime");
				flag=1;
				break;
			}
				else
				{
					System.out.println("no is prime");
				}
			}
		
/*if(flag==0){
	System.out.println("no is prime");
}*/
	}

}
