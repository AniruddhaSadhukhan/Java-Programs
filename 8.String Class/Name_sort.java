
/*Using command line argument, Create a class Name_sort which takes 
names of cities by user and print the name in reverse & sorted order.*/
//		by Aniruddha

class Name_sort
{
	public static void main(String names[])
	{	
		System.out.println("Names in reverse order : ");
		for(int i=names.length-1;i>=0;i--)
			System.out.print(names[i]+" ");	
			
		System.out.println("\nNames in sorted order : ");
		for(int i=0;i<names.length;i++)
		{
			for(int j=i+1;j<names.length;j++)
				if(names[j].compareTo(names[i])<0)
				{
					String t = names[j];
					names[j] = names[i];
					names[i] = t;
				}
			System.out.print(names[i]+" ");	
		}
		System.out.println();		
	}
}

/*Sample Output
Names in reverse order : 
kochi chennai delhi mumbai pune kolkata 
Names in sorted order : 
chennai delhi kochi kolkata mumbai pune
*/
