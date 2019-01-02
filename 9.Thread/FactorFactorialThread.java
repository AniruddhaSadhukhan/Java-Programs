/*Write a program, which can run two-thread simultaneously. 
One thread will calculate the factorial of a number and another 
thread will calculate the factors of that number. 
Make sure main thread finishes last. */

//					by Aniruddha

class Factor implements Runnable
{
	Thread t;
	int n;
	
	Factor(int x)
	{
		n = x;
		t=new Thread(this,"Factor Thread");
		System.out.println("\nFactor thread created : "+t);
		t.start();
	}
	
	public void run()
	{
		try
		{
			System.out.print("Factors of "+n+" are : ");
			for(int i = 1;i<=n;i++)
			{
				if(n%i == 0 )
					System.out.print(i+" ");
			}
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		System.out.println("\nExiting "+t);
	}
}

class Factorial implements Runnable
{
	Thread t;
	int n;
	
	Factorial(int x)
	{
		n = x;
		t=new Thread(this,"Factorial Thread");
		System.out.println("\nFactorial thread created : "+t);
		t.start();
	}
	
	public void run()
	{
		try
		{
			long f = 1;
			for(int i = 2;i<=n;i++)
			{
				f*=i;
			}
			System.out.print("Factorial of "+n+" is : "+f);
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		System.out.println("\nExiting "+t);
	}
}

class FactorFactorialThread
{
	public static void main(String []args)
	{
		Factor obj = new Factor(12);
		Factorial obj2 = new Factorial(5);
		
		try
		{
			obj2.t.join();
			obj.t.join();
		}
		catch (InterruptedException e)
		{
			System.out.println(e);
		}
		
		System.out.println("Exiting main thread");
	}
}
	
/*
Factor thread created : Thread[Factor Thread,5,main]
Factors of 12 are : 1 2 3 4 6 12
Factorial thread created : Thread[Factorial Thread,5,main]

Exiting Thread[Factor Thread,5,main]
Factorial of 5 is : 120
Exiting Thread[Factorial Thread,5,main]
Exiting main thread
*/
		