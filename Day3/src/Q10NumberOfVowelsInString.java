import java.util.Scanner;

public class Q10NumberOfVowelsInString {
	public static int countVowels(String str)
	{
		int count = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                count++;
            }
        }
		return count;
	}
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter String :- ");
		String str=s.next();
		int count =countVowels(str);
		System.out.println("Total No of Vowels is "+ count);
	}
}
