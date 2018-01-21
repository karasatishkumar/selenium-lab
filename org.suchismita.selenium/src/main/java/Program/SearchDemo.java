package Program;

import java.util.Scanner;

public class SearchDemo {

	public static void main(String[] args) {
		
		int loc=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of element");
		int size = sc.nextInt();
		//store it in array
		int arr[] = new int[size];
		System.out.println("enter array elements:"+size);
			for(int i=0;i<size;i++)
				arr[i]=sc.nextInt();
				
			
		System.out.println("enter search element");
		int search = sc.nextInt();
		for(int i=0;i<size;i++){
			if(arr[i]==search)
				{
					loc=i+1;
					//break;
				}
			
			
				if(loc==0){
					System.out.println("not found");
					
				}
				else{
					System.out.println("element found:"+ loc);
				}
			}
		}

	}




