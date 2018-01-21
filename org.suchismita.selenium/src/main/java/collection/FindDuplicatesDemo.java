package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class FindDuplicatesDemo {
	public static void main(String args[]){
		List<Object> li= new ArrayList<Object>();
		li.add('a');
		li.add("abc");
		li.add('a');
		li.add("def");
		li.add(10);
		li.add(10);
		li.add("java");
		
		Iterator<Object> it = li.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		for(int i=0;i<li.size();i++){
			for(int j=i+1;j<li.size();j++){
				if(li.get(i).equals(li.get(j))){
					li.remove(j);
					j--;
				}
	}
	
			
		}
		
		
		
		System.out.println("after removing duplicates:"+li);
	}

}
