import java.util.Scanner;

/*Create an interface MessageEncoder that has a single abstract method encode(plainText),
where plainText is the message to be encoded. The method will return the encoded message.
Create an abstract class Cryptography which takes a plain text (any string) and display the
encrypted text .Create two derived classes TranspositionCipher and CaesarCipher that
implements the interface MessageEncode. CaesarCipher should have one parameter called
shift. Define the method encode() so that each letter is shifted by the value in shift. For
example, if shift is 3, a will be replaced by d, b will be replaced by e, c will be replaced by f,
and so on. TranspositionCipher have one parameter called key. Define the method encode()
so that each letter is transposed by the value of key. For example, if key is 3 1 2, then 1 st
character will be replaced by 3 character, 2nd will be replaced by 1st and 3rd will be replaced
by 1 st . Dispatch the methods dynamically.*/

//			by Aniruddha

interface MessageEncoder
{
	String encode();	
}

abstract class Cryptography
{
	String msg;
	Cryptography(String S)
	{
		msg = S;
	}
	abstract void display();
}

class TranspositionCipher extends Cryptography implements MessageEncoder 
{
	int [] key;
	TranspositionCipher(String m,int []k)
	{
		super(m);
		key = k;
		
	}
	public String encode()
	{
		int l = msg.length();
		int k = key.length;
		String enc = "";
		for(int i=0;i<l;i++)
		{
			enc += msg.charAt(((i/k)*k-1)+key[i%k]);
		}
		return enc;
	}
	void display()
	{
		System.out.println("Transposition Cipher Encoded message :"+encode());
	}
}

class CaesarCipher extends Cryptography implements MessageEncoder
{
	int shift;
	CaesarCipher(String m,int s)
	{
		super(m);
		shift = s;
		
	}
	
	public String encode()
	{
		int l = msg.length();
		String enc = "";
		for(int i = 0 ; i<l;i++)
		{
			char c = msg.charAt(i);
			c+=shift;
			enc += c;
		}
		return enc;
	}
	void display()
	{
		System.out.println("Caesar Cipher Encoded message :"+encode());
	}
}

class Encode
{
	public static void main (String args[])
	{
		System.out.print("Enter message : ");
		Scanner in = new Scanner(System.in);
		String s;
		s=in.next();
		
		Cryptography c;
		
		System.out.println("Shift for Caesar Cipher = 5");
		int shift=5;
		CaesarCipher ob=new CaesarCipher(s,shift);
		c = ob;
		c.display();
		System.out.println("Key for Transposition Cipher = 3 1 2");
		int []key = {3,1,2};
		TranspositionCipher obj=new TranspositionCipher(s,key);
		c = obj;
		c.display();
	}
}
/*Sample Output
Enter message : abcdefghi
Shift for Caesar Cipher = 5
Caesar Cipher Encoded message :fghijklmn
Key for Transposition Cipher = 3 1 2
Transposition Cipher Encoded message :cabfdeigh
*/
		
