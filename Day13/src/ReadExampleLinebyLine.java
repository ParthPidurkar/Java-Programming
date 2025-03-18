import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadExampleLinebyLine
{

	public static void main(String[] args) throws IOException 
	{
		FileReader fr = new FileReader("dac1.txt");
		BufferedReader br = new BufferedReader(fr);
		
//		String str1 =br.readLine();
//		String str2 =br.readLine();
//		
//		System.out.println(str1);
//		System.out.println(str2);
		String str;
		
		while((str = br.readLine())!=null)
		{
			System.out.println(str);
		}
		
		
		
		
		
		br.close();
		fr.close();
		
		
	}
	
	
}
