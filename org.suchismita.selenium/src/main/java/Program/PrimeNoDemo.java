
package Program;

public class PrimeNoDemo {

	public static void main(String[] args) {
		//int no=50;
		int count=0;
		for(int i=0;i<=10;i++){
			count=0;
			for(int j=2;j<=i/2;j++){
				if(i%j==0){
				count++;
				break;
			}
		}
			if(count==0){
				System.out.println(i);
			}
		}

}
}
