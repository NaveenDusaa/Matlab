package mypack;
class Box {
	int y=50;
	void show() {
	System.out.println("one");
	}
	int z=80;
	protected void max() {
		System.out.println(z);
		
	}
}
public class Access extends Box {
	int x=60;
	void show() {
		System.out.println("three");
	}
	public void print() {
		System.out.println("two");
	}
public static void main(String args[]) {
	Access ob=new Access();
	ob.show();
	ob.max();
	
	ob.print();
	System.out.println(ob.x);
	System.out.println(ob.y);
	

}

}
