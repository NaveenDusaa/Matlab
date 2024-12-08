package NewPac;
//super & this keywords using instance variable
class Book{
	int a=10;
	void max(int x) {
		System.out.println(x);
	}
	int t=100;
	void display() {
		System.out.println(t);
	}
	
}
	
public class Hello extends Book {
	int a=30;
	void show() {
		int a=40;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
	}
	
	public static void main(String args[]) {
		Hello ob=new Hello();
		ob.show();
		ob.display();
	    ob.max(50);
	    
		
	}
	
	
	

}
	
