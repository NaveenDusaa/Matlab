class A
{
	int a=20;
	void show(){
		System.out.println("A class");
}
}
class Hello extends A
{
	int b=30;
	void print(){
		System.out.println("B class");
	}
}

	public static void main(String args[])
	{
	Hello H=new Hello();
	System.out.println(H.a);
	H.show();
	System.out.println(H.b);
	H.print();

}





