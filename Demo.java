package Arrays;
//size calculate in array

public class Demo {
	public static void main(String args[]) {
		String s="Heloo";
		char[] ch=s.toCharArray();
		System.out.println(ch);
		int[][] i= {
				{70,60,80},
				{100,50,900},
			    {100,50,90}
				
		};
		int size=0;
		for(int j=0;j<i.length;j++) {
			size+=i.length;
		//	System.out.println(size);
		
		}
		System.out.println(size);
	}
	

}
