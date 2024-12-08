package NewPac;
// method overriding in multilevel inheritence

class Y{
	    int x=50;
	void show () {
		System.out.println(x);
	}
	void print() {
		System.out.println("welcome");
	}
}
class F extends Y {
	void max() {
		System.out.println("mummy");
	}
	void min() {
		System.out.println("chubby");
		
	}
}
public class D extends F {
	void show() {
		System.out.println("Naveen");
	}
	int y=50;
	void display() {
		System.out.println(y);
	}
	public static void main (String args[]) {
		D ob=new D();
		ob.show();
		ob.print();
		ob.display();
		ob.max();
		ob.min();
	}

}
