/*Write a class StringUtil inside package “strUtil‟ using default constructor 
and two overloaded constructor one of which receives a String and prints a 
String that is the exact reversal of the characters in the first String and 
another constructor takes two arguments-a string and a number- if the number 
is a valid, then display the character from the string as specified by that number. */

//						by Aniruddha

package strUtil;

public class StringUtil
{
	
	public StringUtil(){}
	public StringUtil(String s)
	{
		StringBuffer rev = new StringBuffer(s);
		rev.reverse();
		System.out.println("String = "+s+"\tReverse = "+rev);	
	}
	public StringUtil(String s,int n)
	{
		try
		{
			System.out.println("String = "+s+"\tCharacter at "+n+" = "+s.charAt(n));
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
	}
}