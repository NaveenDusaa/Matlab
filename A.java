package Abstraction;
// abstraction using abstract key word;
 
abstract class M {
	abstract void display();


  
}
	

public class A extends M {
	public void display() {
		System.out.println("cat");
	}
	public void man(int a) {
		System.out.println(a);
	}
	public void manin(long b) {
		System.out.println("show");
	}


public static void main (String args[]) {
		A ob=new A();
		ob.display();
		ob.man(50);
		ob.manin(5550000L);
		//System.out.println(ob.men(80));
	//	ob.show();
		int pp=10;
		System.out.println(pp);
		
	}
}



	

