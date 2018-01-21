package TestngDemo;

import java.io.FileInputStream;

public class DataproviderExcel {
	String path;
	FileInputStream fis;
	
	
	public DataproviderExcel(String path){
		
		this.path=path;
		try{
			fis = new FileInputStream(path);
			
			
			
			
		    
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}
	public String getcelldata(String sheet, String rowname, String colname){
		
		
		
		return null;
		
	}
		
	}


