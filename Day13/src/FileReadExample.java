import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadExample 
{

	public static void main(String[] args) throws IOException 
	{
	
		FileReader fr = new FileReader("dac1.txt");
		
	    //char ch	=(char) fr.read();
		int ch;
		
	    while((ch =fr.read())!=-1)
	    {
	    System.out.print((char)ch);
	    	
		
	    }
	}
	
	
	
}
