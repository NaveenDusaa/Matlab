package mypack;

class Mycollege {
	void max() {
		System.out.println("one");
	}
	public void display() {
		System.out.println("three");
	}
	protected void print() {
		System.out.println("four");
	}
	void run() {
		System.out.println("six");
	}
}

class Meh extends Mycollege{
	public  void max() {
		System.out.println("two");
	}
}

public class Myclass extends Mycollege{
	private void ma() {
		System.out.println("five");
	
	}
public static void main(String args[]) {
		 Myclass ob=new Myclass();
		 ob.max();
		 ob.ma();
		 Mycollege ob1=new Mycollege();
		 ob1.max();
		 ob1.display();
		 ob1.print();
		 ob1.run();
		  
		
		
}
		
		 
		 
}

	    
	    
		
	

