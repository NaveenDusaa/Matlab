package mypack;
public class Test {
  /*	int add (int a,int b)
	{
	 int 	c=a+b;
		return c;  */
	
 /*  int subtraction(int  a,int b)
   {
	   int c=a-b;
	   return c;
   }                   */
	int max (int a,int b)
	{
		if (a>b)
			return a;
		else 
			return b;
		
	}

	
	
	
	public static void main (String args[]) {
		
	/*	int z=new Test ().add(20,50);
		System.out.println(z);
		Test T=new Test();
	     int y=new Test().add(50, 50);
	     System.out.println(y);
	     int x=new Test().add(70, 90);
	     System.out.println(x);  */
		
  /*		int y=new Test().subtraction(500, 200);
		System.out.println(y);
		int b=new Test().subtraction(800,1000);
		System.out.println(b);   */
		
		
		int r=new Test().max(50,60);
		System.out.println(r);
		int e=new Test().max(80, 50);
		System.out.println(e);
		
		
	     
		
		
	}
	
	
	
	
		
		
	
	

}
