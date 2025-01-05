package Stringhandling;

public class T {
public static void main(String args[]) {
	String n="Naveen";
	String u="naveen";
	System.out.println("length method() :" + n.length());
	System.out.println("charAt method() :"  +n.charAt(5));
	System.out.println("toLowerCase method() :" +n.toLowerCase());
	System.out.println("toUpperCase method() :"  +n.toUpperCase());
	System.out.println("valueOf method() :" +n.valueOf(n+"Netha"));
	String ob=n.replaceAll("Naveen", "Nagabhushanam");
	System.out.println("replaceAll method() :" +ob);
	System.out.println( "trim method :" +n.trim());
	System.out.println("equals method() :" +n.equals(u));
	byte[] b=n.getBytes();
	for(byte y:b) {
		System.out.println("getBytes method() :" +y);
	 char[] name= {'h','e','l','l','o'};
	 char[] names=n.toCharArray();
	 for(char you:names) {
		 System.out.println("toCharArray method() :" +you);
     
     
     
     
     
	 }
		
	}
	
}
	
}

