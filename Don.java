package Encapslation;

public class Don {
	private String name;
	private int num;
	  
/*	public String getname() {
		return name;
	}
//	public void setname(String  a) {
	//	name=a;
		
	}
	public int getnum() {
		return num;
	}
	public void setnum(int n) {
		num=n;
	}  */
	
	
	
   public static void main(String args[]) {
	   Don ob=new Don();
	   ob.setname("Nagabhushanam");
	//   ob.setnum(80);
	 //  System.out.println("name :"+ ob.getname());	  
	   //System.out.println("num :" + ob.getnum());
	 	  
   }
   public static void setname(String name) {
	   System.out.println("Happy Birthday"  + name);
   }
}

   


