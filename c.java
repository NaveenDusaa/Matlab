package NewPac;
class U {// Method overloading multilevel 
	int x=50;
	void show() {
		System.out.println(x);
	}
	float f=50.8f;
	void  max() {
		System.out.println(f);
	}
}
class N extends U {
	int z=90;
	void print() {
		System.out.println(z);
	}
	void min() {
       System.out.println("Naveen Netha");
	}
	
}
public class c extends N {
	String name="Naveen";
	void display() {
		System.out.println(name);
	}
	
	void show () {
		System.out.println("kavitha");
	}
	
public static void main (String args[]) {
	c ob=new c();
	ob.show();
	ob.max();
	ob.print();
	ob.min();
	ob.display();
	ob.show();
}
	
    	
	

}
