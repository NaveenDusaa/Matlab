//check palindrone 
package Palindrome;
import java.util.*;

public class Two {
	public static void main(String args[]) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter any number:");
		int a=sc.nextInt();
		int num=a;
		int rev=0;
		while(a!=0) {
			rev=rev*10+a%10;
			a=a/10;
		}
			if(num==rev) {
				System.out.println("palindrone");
			}
			else {
				System.out.println("not palindrone");
			}
		
	}

}
