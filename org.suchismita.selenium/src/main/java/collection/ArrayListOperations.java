package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListOperations {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		List<String> ar = new ArrayList<String>(); //generic class
		//List<> ar = new ArrayList<>(); //Collection interface, it is not type safe  we can take any type of data
		ar.add("apple");
		ar.add("banana");
		ar.add("guava");
		ar.add("pomogranate");
		ar.add("grapes");
		System.out.println(ar);
		
		//remove one string
		ar.remove(3);
		ar.remove("apple");

		//display size
		System.out.println(ar.size());
		
		//iterator is use for retrive the data
		Iterator it = ar.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		ListIterator li = ar.listIterator();
		System.out.println("forward direction");
		while(li.hasNext()){
			System.out.println(li.next());
		}
		System.out.println("backward direction");
		while(li.hasPrevious()){
			System.out.println(li.previous());
		}
		
	}

	
}
