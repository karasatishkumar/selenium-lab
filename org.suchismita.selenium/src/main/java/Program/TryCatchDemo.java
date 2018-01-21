package Program;

import java.io.IOException;

import net.sourceforge.htmlunit.corejs.javascript.ast.CatchClause;
import net.sourceforge.htmlunit.corejs.javascript.ast.ThrowStatement;

public class TryCatchDemo {
	/*public void exp(String a){
		throw new NullPointerException("hello");
		
		
	}*/
	
	public static void main(String args[]) //throws Exception, ArithmeticException
	{
		/*TryCatchDemo td = new TryCatchDemo();
		td.exp("abc");*/
		try{
			int a =10,b=0,c;

			//System.exit(1);//terminate code if we will write exit then terminate next line of code
			
			
			c=a/b;
			System.out.println("exception occur");
			System.out.println(c);
			
		}
		
		catch(Exception e){
			System.out.println("same exception use both catch");
		}
		
		/*catch(ArithmeticException e){
			System.out.println("catch exception");  // at first 
			System.out.println(e);
		}
		catch(Exception e){
			System.out.println("same exception use both catch");
		}*/
		finally{
			int a =20;// and also if assing same value then it will be overlap and result store in variable a= 20 
			System.out.println("cleanup"); //finally will execute whether catch will through exception or not finally will execute
			System.out.println(a);
		}
		
	}

}
