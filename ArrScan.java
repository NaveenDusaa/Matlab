package Arrays;
import java.util.*;

public class ArrScan {
	public static void main(String args[]) {
		Scanner s=new Scanner (System.in);
		System.out.println("Enter any number rows :");
		int row=s.nextInt();
		System.out.println("Enter any number col :");
		int col=s.nextInt();
		int[][] ob=new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				ob[i][j] = (i+1)*(j+1);
			}
			
		}
		for (int i=0;i<row;i++) {
			for (int j=0;j<col;j++) {
				System.out.print(ob[i][j] + " ");
			}
			System.out.println( );
			
		}
		s.close()
	}
	

}
