package Stringhandling;
// Boxing and Unboxing ;

public class Hello {
	public static void main(String args[]) {
		int a=20;
		Integer b=Integer. valueOf(a);//auto boxing 
		Integer j=a;
		System.out.println(j);
		
		
		int c=60;
		Integer d=new Integer(c);
		System.out.println(d);
	
		
		float f=450.6f;
		Float ff=Float.valueOf(f);
		Float fff=ff;
		System.out.println(fff);
		
		Float u=new Float(563.5f);//unboxing 
		System.out.println(u);
		
		
		char ch='D';
		Character chh=ch;
		System.out.println(chh);
		
		
		
		Character chr=new Character('O');//unboxing
		char chrr=ch;
		System.out.println(chrr);
		
		boolean t=true;
		Boolean t1=Boolean.valueOf(t);
		Boolean t2=t1;
		System.out.println(t2);
		
		
		Boolean ty=new Boolean(false);//unboxing
		boolean tyy=ty;
		System.out.println(tyy);
		
		
		
		
		
		
		
		
		
		
	}

}
