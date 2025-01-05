package Abstraction;

interface Ab {
	void show();
	void display();
	int num=400;
	void view();
	void h();
	
}
  abstract class  B implements Ab {
	public void show() {
		System.out.println("one");
	}
	public void display() {
		System.out.println("two");
	}

}
public class Men extends B {
	public void view() {
		System.out.println("Hi am v");
	}
	public void h() {
		System.out.println("HI am compiler");
	}
public static void main(String args[]) {
	   Ab ob=new Men();
		ob.show();
		ob.display();
		System.out.println(Ab.num);
		ob.view();
		ob.h();
		
	}

}
