import strUtil.*;

class StringMain
{
	public static void main(String []args)
	{
	
		StringUtil a = new StringUtil("Aniruddha");
		StringUtil b = new StringUtil("Sadhukhan",3);
		StringUtil c = new StringUtil("Sadhukhan",20);
	}
}

/*Sample Output
String = Aniruddha      Reverse = ahddurinA
String = Sadhukhan      Character at 3 = h
java.lang.StringIndexOutOfBoundsException: String index out of range: 20
*/