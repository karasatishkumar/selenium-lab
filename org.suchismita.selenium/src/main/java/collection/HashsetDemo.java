package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class HashsetDemo {
	//store string value and retrive using iterator
	
	public static void main(String args[]){
		HashSet<String> hs = new HashSet<String>();
		hs.add("suchi");
		hs.add("smita");
		hs.add("satish");
		hs.add("suchi");
		System.out.println(hs);
	
//retrive value

	
	
	Iterator it = hs.iterator();{
	while(it.hasNext()){
		String s=(String)it.next();
		System.out.println(s);
	
	
}

	}
		
		/*Collection cs =new ArrayList<>();
		cs.add("suchi");
		cs.add(10);
		
		System.out.println(cs);*/
	}
}
