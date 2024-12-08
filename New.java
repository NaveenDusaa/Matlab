package mypack;

abstract class My {
	abstract void show();
	void print() {
		System.out.println("Naveen");
	}
	
}
 public class New  extends My {
	void show() {
		System.out.println("mummy");
	}
public static void main(String args[]) {
	New ob=new New();
	ob.show();
	ob.print();
	
}
	
	
}
