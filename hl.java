package Abstraction;

public class hl {
public static void main (String args[]) {
	String s1="Hello";
	char sh=s1.charAt(2);
	System.out.println(sh);
	
	
	String h="Naven";
	String p="netha";
	String  d=h.concat(p);
	String l=p+h;
	System.out.println(l);
	
	
	
	String name="harish";
	int le=name.length();
	System.out.println(le);
	
	
	String op="Welcome";
	String ob="hello";
	int t=op.compareTo(ob);
	System.out.println(t);
	
	
	String i="Hello";
	String y="ai";
	boolean s=i.equals(y);
	System.out.println("equals() boolean  :" +s);
	
	//String startwidth()	;
	String o="Yes";
	String w="Ye";
	String b="iu";
	boolean pp=o.startsWith(w);
	boolean oo=o.startsWith(b);
	System.out.println(pp);
	System.out.println(oo);
	
	
	String hh="hello";
	String ii="welcome";
	boolean ee=hh.endsWith(i);
	System.out.println(ee);
	
	String man="Welcome to java";
	String how="j";
	//int iii=man.indexOf(how);
	System.out.println(man.indexOf(how));
	
	
	
	
	
}

}
