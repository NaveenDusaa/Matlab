package FileInputStreams;
import java.io.File;
import java.io.IOException;
import java.io.FileInputStream;

public class File {
   public static void main(String args[]) throws IOException {
	   File file=new File("\\sample.txt");
	   if ( !file.exists()) 
		   file.creatNewFile()
	   
	   
   }
	
	
	
}
