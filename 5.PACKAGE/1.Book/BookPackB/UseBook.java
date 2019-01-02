package BookPackB;
import BookPack.Book;

/*Create a package” BookPack”. Inside package “BookPack” create a class called “Book”
which holds the data member publisher, author, publication date. Create another package
“BookPackB” and inside this package create another class “UseBook” which implements the
main function to create an array of object of “Book” class and display the details of various
book objects.*/
//			by Aniruddha 

class UseBook
{
	public static void main(String []args)
	{
		Book[] ob = new Book[3];
		
		ob[0] = new Book("Origin","Dan Brown",10102017);
		ob[1] = new Book("61 Hours","Lee Child",01052015);
		ob[2] = new Book("Master of Game","Sidney Sheldon",03072011);
		
		for(int i = 0; i<3;i++)
			ob[i].show();
	}
}

/*Sample Output:
Origin - Dan Brown - 10102017
61 Hours - Lee Child - 283661
Master of Game - Sidney Sheldon - 816137
*/
