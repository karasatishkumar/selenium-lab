

package collection;

import java.util.Scanner;

public class AscDescDemo {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number:");
		int n =sc.nextInt();
		
		//declare an array
		int[] arr = new int[n];
		int i, j, temp=0;
        System.out.println("enter"+n +"array elements:");
        	for(i=0;i<n;i++){
        		arr[i]=sc.nextInt();
        		
        	}
        	
		/*System.out.println("print all array elements");
			for(i=0;i<n;i++){
				System.out.println(arr[i]);
				
			}*/
			for(i=0;i<n;i++){
				for(j=i+1;j<n;j++){
					if(arr[i]>arr[j]){
						temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
						
					}
				}
			}
			System.out.println("after ascending order result is:");
		  //ascending order
			for(i=0;i<n;i++){
				System.out.println(arr[i]);
			}
			
			//for descending order
			for(i=0;i<n;i++){
				for(j=i+1;j<n;j++){
					if(arr[i]<arr[j]){
						temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
						
					}
				}
			}
			System.out.println("after ascending order result is:");
		  
			for(i=0;i<n;i++){
				System.out.println(arr[i]);
			}
	}
	

}
