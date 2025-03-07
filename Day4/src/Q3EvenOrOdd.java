
public class Q3EvenOrOdd {
public static int evenOdd(int  n)
{
	int res=0;
	if(n%2==0)
	{
		res = n*n;
	}
	else
	{
		res = n*n*n;	
	}
	return res;
}
}
