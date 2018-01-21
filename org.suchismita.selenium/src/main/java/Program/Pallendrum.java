package Program;

public class Pallendrum {

	public static void main(String[] args) {
		int n,r=0,sum=0;
		n=123;
		int temp=n;
		while(n>0){
			
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		
		
			if(temp==sum){
				System.out.println("no is pallendrum");
				
			}
			else
			{
				System.out.println("no not pallendrum");
			}
		}

	}


