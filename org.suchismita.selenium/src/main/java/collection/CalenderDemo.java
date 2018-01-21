package collection;

import java.util.Calendar;

public class CalenderDemo {
public static void main(String args[]){
	//create calender class object
	Calendar cl = Calendar.getInstance();
	
	//display date
	int dd=cl.get(Calendar.DATE);
	int mm=cl.get(Calendar.MONTH);
	int yy = cl.get(Calendar.YEAR);
	System.out.println(dd +"/"+mm +"/"+yy);
	
	//display time
	int h=cl.get(Calendar.HOUR);
	int m=cl.get(Calendar.MINUTE);
	int s=cl.get(Calendar.SECOND);
	System.out.println(h+":"+m+":"+s);
}
}
