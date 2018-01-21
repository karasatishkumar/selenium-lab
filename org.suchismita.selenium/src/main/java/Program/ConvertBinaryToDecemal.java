package Program;

import java.util.Scanner;

public class ConvertBinaryToDecemal {

	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter binary no:");
		String strconvert = sc.nextLine();
		System.out.println(Integer.parseInt(strconvert,2));
	}

}
