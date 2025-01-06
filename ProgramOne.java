package FileInputStreams;
import java.io.File;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedInputStream;
import java.io.BufferedReader;


public class ProgramOne {
	public static void main(String args[]) throws IOException {
		try {
			File file =new File("C:\\Users\\dusan\\OneDrive\\Desktop\\Naveen\\naveen.txt");
			if (!file.exists())
				file.createNewFile();
			FileReader fr=new FileReader(file);
			BufferedReader br=new BufferedReader(fr);
			String text=new String();
			String lint=new String();
			int newCode;
			while((newCode=br.read())!=-1) {//While((lint=br.read())!=null)
				System.out.print((char)newCode);
				
			                                  //text+=lint+\n;
				                             //System.out.print(text);
				
			}
			fr.close();
			br.close();
				
			
		    
		}
		catch (IOException ae) {
			System.err.println(ae);
		}
	}

}
