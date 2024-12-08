package NewPac;
//method overlodding in compile time polymorphism;
public class Men {
	void add(int a,int b,float c) {
        System.out.println(a/b+c);
        
	}
	void max(float f,int d) {
		System.out.println(f-d);
	}
	
	


public static void main(String args[]) {
	Men ob=new Men();
	ob.add(50,80,60.4f);
	ob.max(50.3f, 69);
	
	
}
	
}
