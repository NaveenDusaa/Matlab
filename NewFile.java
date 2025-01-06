// program to using in scanner class for file read
package FileInputStreams;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;


public class NewFile {
	public static void main(String args[]) throws IOException {
		try {
		File file=new  File("C:\\Users\\dusan\\OneDrive\\Desktop\\Naveen\\sample.txt");
		if(!file.exists())
			file.createNewFile();
		//FileInputStream fis=new FileInputStream(file);
		Scanner sc=new Scanner(file);
		String ss=new String ();
		while(sc.hasNextLine()) {
			ss+=sc.nextLine()+"\n";
				
		}
		System.out.println(ss);
		sc.close();
		}catch(IOException ae) {
			System.err.println(ae);
		}
		
	}

}
