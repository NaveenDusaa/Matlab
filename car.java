package Abstraction;
//non abstract method using abstract;

abstract class Book{
	abstract void you();
	
	public void how() {
		System.out.println("hello");
	}
}
class pen extends Book {
	public void dis() {
		System.out.println("moon");
	}
	public void men(int a,int b) {
		System.out.println( a%b  );
	}
}
public class car {
	public static void main(String args[]) {
		pen ob=new pen();
		ob.how();
		ob.dis();
		ob.men(52, 80);
		
	}

}
