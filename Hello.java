package Arrays;

public class Hello {
	public static void main(String args[]) {
	String[][] t= {{"Akhila","Akhil",},
			{"Ramesh"}
	
			
	};
	for (int h=0;h<t.length;h++) {
		for(int g=0;g<t[h].length;g++) {
			System.out.print(t[h][g] + " ");
		}
		System.out.println( );
	}
	
	int []name= {10,100,500};
	System.out.println(name[2]);
	int  sum=0;
	for(int total:name) {
		sum=sum+total;
	}
	System.out.println(sum);
		}
	}


