
public class Q4VowelorNot {
public static void check(String str)
{
	str = str.toLowerCase();
	char ch = str.charAt(0);
	if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
    {
        System.out.println("It is Vowel ");
    }
	else
	{
		 System.out.println("It is not Vowel ");
	}
}

}
