class Q1TryCatchFinallyThrowThrows 
{
    
    static void riskyMethod() throws ArithmeticException 
    {
        throw new ArithmeticException("Arithmetic Exception Occurred!");
    }

    public static void main(String[] args)
    {
        
        try
        {
            int a = 5 / 0;
        } 
        catch (ArithmeticException e)
        {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        } 
        catch (Exception e)
        {
            System.out.println("Caught General Exception: " + e.getMessage());
        }

        try 
        {
            int arr[] = {1, 2, 3};
            System.out.println(arr[5]);
        } 
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } 
        finally
        {
            System.out.println("Finally block executed after try-catch.");
        }

        try 
        {
            System.out.println("Inside try-finally block.");
        } 
        finally 
        {
            System.out.println("Finally block executed even without catch.");
        }

        try 
        {
            System.out.println("Outer try block.");
            try
            {
                riskyMethod();
            } 
            catch (ArithmeticException e)
            {
                System.out.println("Caught exception in inner try: " + e.getMessage());
            }
        }
        catch (Exception e)
        {
            System.out.println("Caught exception in outer try: " + e.getMessage());
        }

        System.out.println("Rest of code");
    }
}

