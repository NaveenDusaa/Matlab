package Encapslation;
interface Dad {
	void view();
}



public class Anonymous {
public static void main (String args[]) {
		Dad d=new Dad() {
			public void view() {
				System.out.println("welcome");
			}
		};
		d.view();
	}
}
	
	


