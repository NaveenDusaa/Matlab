package NewPac;
//runtime polymorphism method overriding 

 class Naga {
	 
	void display() {//overriden
		System.out.println("Naveen1");
	}
	void show() {
		
		System.out.println("naveen2");
	}

}
public class Naveen extends Naga{
	void display() {//overriding method
		
		System.out.println("Hello");
		
	}
	void print() {

		System.out.println("New");
		
	}
	
public static void main(String args[]) {
	Naveen n=new Naveen();
	
	
	n.display();
	n.display();
	n.show();
	n.print();
}
}
