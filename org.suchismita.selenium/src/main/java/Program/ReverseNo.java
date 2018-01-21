package Program;

import java.util.Scanner;

public class ReverseNo {

	public static void main(String[] args) {
		int num = 0;
		int revnum=0;
		System.out.println("input the num:");
		Scanner sc = new Scanner(System.in);
		
		num=sc.nextInt();
		while(num!=0){
			revnum=revnum*10;
			revnum=revnum + num%10;
			num=num/10;
		}
		
			
		
		System.out.println("reverse of number:"+revnum);

	}

}
