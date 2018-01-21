package collection;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArraySortingDemo {
	public static void main(String args[]){
		
	Integer[] intarray= {30,10,45,19,6};
	//before sorting
	
	
	System.out.println("before ascending sorting");
	for(Integer ivalue : intarray){
		System.out.println(ivalue);
	}
	//sorting in ascending order
    Arrays.sort(intarray);
    //after sorting
    System.out.println("after ascending order:");
    for(Integer ivalue:intarray){
    	System.out.println(ivalue);
    }
    
    //sorting a string values
    String[] str = {"suchi", "smita", "satish", "abc", "ghy"};
    //before sorting
    System.out.println("before ascending order");
    for(String stringsort : str){
    	System.out.println(stringsort);
    }
    //after sorting
    Arrays.sort(str);
    System.out.println("after sorting string in ascending order");
    for(String stringsort:str){
    	System.out.println(stringsort);
    }
   
    
    
    
    //sorting in descending order
    Integer[] Desarray ={3,10,30,5,6,76};
    //before sort
    System.out.println("before descending");
    for(Integer ivalue1 : Desarray){
    	System.out.println(ivalue1);
    	

    }
    //after descending order
    Arrays.sort(Desarray, Collections.reverseOrder());
    System.out.println("after descending order");
    for(Integer ivalue1:Desarray){
    	System.out.println(ivalue1);
    	
    }
    //String descending
    String[] str1 = {"ert", "yut", "bfg"};
    
    Arrays.sort(str1,Collections.reverseOrder());
    //System.out.println("descending string order");
    for(String ivalue2:str1){
    	System.out.println("descending order is:"+ ivalue2);
    }
    
}
}