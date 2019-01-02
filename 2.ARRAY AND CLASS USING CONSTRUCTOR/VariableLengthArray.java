import java.util.Scanner;

//Program to create Pattern
//	by Aniruddha

class Pattern
{
	int n;
	int [][]arr;
	Pattern(int p)
	{
		n=p;
		arr = new int[n][];
	}
	
	void createPattern()
	{
		int x=1;
		for(int i=0;i<n;i++)
		{
			arr[i] = new int[i+1];
			for(int j=0;j<i+1;j++)
			{	
				arr[i][j]=x++;
			}
		}
	}
	
	void display()
	{
		System.out.println("Array: ");
		for(int[] i:arr)
		{
			for(int j:i)
				System.out.print(j+" ");
			System.out.println();
		}
	}
}

class VariableLengthArray
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("Input rows: ");
		int n = in.nextInt();
		in.close();	
		
		Pattern ob = new Pattern(n);
		ob.createPattern();
		ob.display();
	}
	
}	
	
/*
Input rows: 
5
Array: 
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 

*/	
