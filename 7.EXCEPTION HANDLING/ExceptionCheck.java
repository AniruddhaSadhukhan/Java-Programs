/*Create an exception class InvalidInputException which takes an integer (say
  10) and prints: “InvalidInputException[ 10 ]”. Create a class CheckPrime
  derived from a class Number which checks if a given no is prime or not and
  generate InvaildInputException if inputs are 0, 1 and any negative no. */
//				by Aniruddha

class InvalidInputException extends Exception
{
    private int n;
   
    InvalidInputException(int a)
    {
        n = a;
    }
   
    //overrides toString() allowing exception description to be displayed using println()
    public String toString()   
    {
        return "InvalidInputException["+n+"]";
    }
}
class Number
{
	int n;
	Number(int a)
	{
		n = a;
	}
}
class checkPrime extends Number
{
	checkPrime(int num)
	{
		super(num);
	}
	
	boolean isPrime() throws InvalidInputException
    	{
      
		if(n<2)
		    	throw new InvalidInputException(n);   
		else
		{
			for(int i=2;i<=n/2;i++)
				if(n%i == 0)
					return false;
			return true;
		}
	}
}

class ExceptionCheck
{
	public static void main(String args[])
    	{   
		for(int i = -1;i<10;i++)
		{
			checkPrime chk = new checkPrime(i);
			try
			{
				if(chk.isPrime())
					System.out.println(i + " is Prime");
				else
					System.out.println(i + " is not Prime");		 
			}
			catch(InvalidInputException e)
			{
				System.out.println(e);
			}
		}
	}
}

/*Sample Output:
InvalidInputException[-1]
InvalidInputException[0]
InvalidInputException[1]
2 is Prime
3 is Prime
4 is not Prime
5 is Prime
6 is not Prime
7 is Prime
8 is not Prime
9 is not Prime

*/

