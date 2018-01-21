package ForLoopExample;

public class pyramidDemo {
	public static void main(String args[]) {
		System.out.println("1st example");
		for (int i = 0; i < 5; i++)

		{

			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// ////////////////////
		System.out.println("2nd example");
		for (int i = 5; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");

			}
			System.out.println();
		}
		
		System.out.println("3rd example");
		for (int i = 0; i < 5; i++) {
			int num = 1;
			for (int j = 0; j < i; j++) {

				System.out.print(num + "");
				num++;
			}
			System.out.println();
		}
	    ///////////////////////
		System.out.println("4th example");
for(int i=5;i>0;i--){
	int n =1;
	for(int j=0;j<i;j++){
		System.out.print(n);
		n++;
	}
	System.out.println();
}

System.out.println("5th example");
int n=5;
int k=2*n-2;
for(int i=0;i<n;i++){
	for(int j=0;j<k;j++){
		System.out.print(" "); //for space
	}
	k=k-1; //k=k-2
	for(int j=0;j<=i;j++){
		System.out.print("* ");
	}
	System.out.println(); //ending line after each row
	
	}
////////////////////////////////
System.out.println("6th example");

for(int i =0;i<5;i++){
	for(int j=0;j<5;j++){
		System.out.print("*");
	}
	System.out.println();
}
System.out.println("7th example");
int no=1;
for(int i=0;i<5;i++){
	for(int j=0;j<i;j++){
		System.out.print(no+"" );
		no=no+1;
	}
	System.out.println();
}


}

	
	
	
	
	
}
