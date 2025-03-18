import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class FileWriteExample1 
{

	public static void main(String[] args) throws IOException 
	{
	    //file created
		FileWriter fw = new FileWriter("dac1.txt",true);
		
		//data
//		String str1 = "welcome to java program";
//		String str2 = "Lab exam will be scheduled on friday";
		
		//write to the file
		
//		fw.write(str1 +'\n');
//		fw.write(str2 +'\n');
		
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		String str; 
		
		
		while(!(str = br.readLine()).equals("end"))
		{
			fw.write(str+'\n');
		}
		
				
		System.out.println("file write is over");
		fw.close();
		
		
		
	}
	
	
}
