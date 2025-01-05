package Encapslation;
  
class A {
	class B {
		
			
	
		static int a=10;
		void show() {
			System.out.println(a);
		}
	}
}


interface holo {
	void show();
	private void print();
}




public class Innerclass {
	
	public static void main(String args[]) {
		
/*		class H{
			void p() {
				System.out.println("hello");
			}
		}
		H ob=new H();
		ob.p(); */
		
		 
		holo h=new holo () {
			public void show() {
				public void print() {
				System.out.println("Welcome");
				System.out.println("Welcome5");
				
			}
		};
		h.show();
		h.print();
		
		
		
		
	}

}
