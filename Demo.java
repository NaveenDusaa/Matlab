package Assignments;

public class Demo {
	public static void main (String args[]) {
//charAt method string
	String name="India is best country in the world";
	char  s1=name.charAt(2);
	System.out.println(s1);
    System.out.println(name);
    
    
  //concat method   
    String s2="Naveen";
    String s3="Netha";
    String s4=s2.concat(s3);
    System.out.println(s4);
    System.out.println(s2  +   s3);
    
    
    
  //toCharArray method  
    String s5="Naveen";
    char[]  s6=s5.toCharArray();
    for(char s7:s6)  {
    	System.out.println(s7);
    	
  //isEmpty method  	
    String s8="";
    String s9="Hello";
    System.out.println(s8.isEmpty());
    System.out.println(s9.isEmpty());
    
  //split method  
    String s10="welcome to java in my life";
    String s[]=s10.split("");
    for (String s11:s) {
    	 System.out.println(s11);
    	 
   //replace method string 	 
    String s12=" i am dusa Nagabhushanam";
    String s13=s12.replace( "i", "I a");
    System.out.println(s13);
    
    
  // trim method  
    String s14="  welcome to --------------   java my life";
    String s15=s14.trim();
    System.out.println(s15);
    System.out.println(s14);
    
    
   //substring method 
    String na="Welcome to";
    		// 012345678910
    String naes=na.substring(8,10);
    String ob=na.substring(0,7);
    System.out.println(naes);
    System.out.println(ob.length());
    
    String pp="Hardik pandiya ,virat kholi ,Dhoni";
    String u=pp.substring(0,7);
    System.out.println(u);
    String y=pp.substring(18,24);
    System.out.println(y);
  
    
    // valueOf method
    
    String nn=na.valueOf("Naveen");
    System.out.println(nn);
    
    
    // getBytes method 
    String i="rashmitha";
    byte[]  b=i.getBytes();
    for(byte t:b)  {
    	System.out.println(t);
    	
    //Boolean stratswith	
    	
    String str="welcome to my village";
    boolean stt=str.startsWith(  "w");
    boolean stp=str.startsWith("u");
     System.out.println("stratsWith : " +stt);
     System.out.println(stp);
    
     
     //endsWith
     
     
     String r="welcome to shopping mall";
     boolean  h=r.endsWith("p");
     System.out.println("endsWith() :"  + h);
    }
    
    
    
    }
    }
	}

}
