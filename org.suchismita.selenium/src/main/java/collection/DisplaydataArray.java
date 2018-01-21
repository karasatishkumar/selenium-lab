package collection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.sun.jna.platform.unix.X11.Display;

public class DisplaydataArray {
	int id;
	String name;
	public DisplaydataArray(int i, String n) {
		id=i;
	    name=n;
		
	}
	void display(){
		System.out.println(id +"/t"+ name);
		}
	



	public static void main(String[] args) throws Exception, IOException {
		 
		//to accept data from keyboard
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //create data with size is 5
		DisplaydataArray arr[]=new DisplaydataArray[5];
		
		//store data in an array
		for(int i=0;i<5;i++){
			System.out.println("enter id:");
			int id= Integer.parseInt(br.readLine());
			
			System.out.println("enter name:");
			String name=br.readLine();
			
			arr[i]=new DisplaydataArray(id, name);
			
			
			
		}
		System.out.println("the data is:");
		//display all data in an array
        for(int i=0;i<arr.length;i++){
        	System.out.println(arr[i]);
        	//arr[i]=display();
        }
	}
}

