package NewPac;

public class Final {
	final static int x=60;
	void show() {
	System.out.println(x);
	}
	final String name="manasa";
	void print() {
		System.out.println(name);
	}

	public static void main(String args[]) {
		final float i=83.45f;
		System.out.println(i);
		Final ob=new Final();
		ob.show();
		ob.print();
	}
}
	


