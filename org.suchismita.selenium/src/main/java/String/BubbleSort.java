package String;

public class BubbleSort {
	public static void Bubble(int[] arr){
		
	
	int n = arr.length;
	int temp=0;
	for(int i=0;i<n;i++){
		for(int j=0;j<(n-1);j++){
			if(arr[j-1]>arr[j]){
				temp=arr[j-1];
				arr[j-1]=arr[j];
				arr[j]=temp;
				
			}
		}
		
	}
	}
	

	public static void main(String[] args) {
		int arr[] = {3,7,5};
		/*System.out.println("array before bubble sort");
		for(int i = 0; i<arr.length;i++){
			System.out.println(arr[i]+"");
		}*/
		//System.out.print();
		Bubble(arr);
		System.out.println("after bubble sort");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i] +"");
		}
		

	}

}
