import java.util.Scanner;

//Program to find Second Largest Number
//	by Aniruddha

class SecondLargest
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("Input array length: ");
		int n = in.nextInt();
		
		int []arr = new int[n];
		
		System.out.println("Input array: ");
		for(int i=0;i<n;i++)
			arr[i] = in.nextInt();
		
		in.close();
		
		System.out.println("Array: ");
		for(int i:arr)
			System.out.println(i+" ");
			
		int max_1,max_2;
		max_1=max_2=arr[0];
		for(int i:arr)
		{
			if(max_1<i)
			{
				max_2=max_1;
				max_1=i;
			}
			else if(max_2<i)
			{
				max_2=i;
			}
		}
		System.out.println("Max: "+max_1+ "\nSecond Max:"+max_2);
		
	}
	
}	
/*
Input array length: 
5
Input array: 
5 25 15 20 10
Array: 
5 
25 
15 
20 
10 
Max: 25
Second Max:20

*/			
