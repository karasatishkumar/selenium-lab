package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class CountWords {
	public static void main(String args[]) throws Exception{
		System.out.println("enter the string:");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] st = str.trim().split(" ");
		System.out.println("no of words count:" +st.length);
	}

}
