package BookPack;

public class Book
{
	private String publisher,author;
	private int date;
	
	public Book(String p,String a,int d)
	{
		publisher = p;
		author = a;
		date = d;
	}
	
	public void show()
	{
	System.out.println(publisher+" - "+author+" - "+date);
	}
}