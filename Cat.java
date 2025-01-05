package Encapslation;

public class Cat {
	private int num;
	private String name;
	private long add;
	public int getnum() {
		return num;
		
	}
	public void setnum(int a) {
		num=a;
	}
	public String getname() {
		return name;
	}
	public void setname(String s) {
		name=s;
	}
	public long getadd() {
		return add;
	}
	public void setadd(long i) {
		add=i;
	}
	
	
		
public static void main(String args[]) {
	Cat b=new Cat();
	b.setnum(50);
	b.setname("mummy");
	b.setadd(80852145L);
	System.out.println("num:"+b.getnum());
	System.out.println("name:"+b.getname());
	System.out.println("add:"+b.getadd());
	
}
}


	
	
	
	
	

