package NewPac;
class Superb{
	 protected void show() {
		System.out.println("one");
	}
	
}
  
public class Super extends Superb {
class A{ 
	public void show() {
		System.out.println("three");
	}
}
class B{

	void show() {
		System.out.println("four");
	}
}
	
 public static void main(String args[]) {
	 Super ob=new Super();
	 A ob1=new B();
	 ob1.show();
	 
	 ob.show();
	 
	
	 
 }
	
	
 

}
