package NewPac;
//program to demonstrate single inheritance;
class A{
	int x=300;
	void show() {
		System.out.println("Naveen");
	}
}
public class B extends A{
	long y=5000020L;
	void display() {
		System.out.println("Nagabhushanam");
	}
	public static void main (String args[]) {
	 B a=new B();
	System.out.println(a.x);
	a.show();
	System.out.println(a.y);
	a.display();
	
	}
	

}
