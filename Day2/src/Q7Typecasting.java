
public class Q7Typecasting {
	public static void main(String args[])
	{
		byte b = 100;
		short s= 3145;
		int i = 151235;
		long l= 41258542;
		float f= 2.235f;
		double d = 2.0053152;
		char ch = 'A';
		System.out.println("Before Type Casting");
		System.out.println("byte value :- " + b);
		System.out.println("short value :- " + s);
		System.out.println("int value :- " + i);
		System.out.println("long value :- " + l);
		System.out.println("float value :- " + f);
		System.out.println("double value :- " + d);
		System.out.println("char value :- " + ch);
		
		System.out.println("After Type Casting");
		System.out.println("byte value :- " +(float) b);
		System.out.println("short value :- " +(float) s);
		System.out.println("int value :- " + (float)i);
		System.out.println("long value :- " + (double)l);
		System.out.println("float value :- " + (int)f);
		System.out.println("double value :- " + (long)d);
		System.out.println("char value :- " + (int)ch);
	}

}
