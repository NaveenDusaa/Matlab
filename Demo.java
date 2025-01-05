package Stringhandling;
import java.lang.*;

public class Demo extends Object {
	public String toString() {
		return "Welcome to my home";
		
	}
	public String ha() {
		return "I love india";
	}
	
	public static void main(String args[]) {
		String a="naveen";
		String b=new String(a);
		System.out.println(b.toString());
		Demo d=new Demo();
		System.out.println(d.toString());
		d.ha();
		
		
	
			
	}

}
