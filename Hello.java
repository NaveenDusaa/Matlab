class A
{
	A(){
		this(50);
		System.out.println("one");
	}
	A(int a){
		System.out.println(a);
	}

}
class Hello extends A
{
	Hello(){
		this(30);
		System.out.println("two");
	}
	Hello(int b){
		System.out.println(b);
}
public static void main (String args[]){
	new Hello();
}
}

     

