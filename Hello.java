package FileInputStreams;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;



public class Hello {
public static void main(String args[])  {
		try {
		File file=new File("C:\\Users\\dusan\\OneDrive\\Desktop\\Naveen\\sample.txt");
		if(! file.exists())
			file.createNewFile();
		FileInputStream fis=new FileInputStream(file);
		int newCode;
		while ((newCode=fis.read())!=-1) {
			System.out.print((char)newCode);
		}
		fis.close();
		
		}catch(IOException ae) {
			System.err.println(ae);
		}
		
	}

}
