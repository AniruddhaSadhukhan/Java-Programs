/*Write a program, which run two threads simultaneously each threads 
prints  "[Hello World]: threadName" Make sure no race condition 
arises and main thread finishes last. */

//					by Aniruddha

class NewThread implements Runnable
{
	Thread t;
	
	NewThread(String name)
	{
		t=new Thread(this,name);
		System.out.println("New thread created : "+t);
		t.start();
	}
	
	public void run()
	{
		try
		{
			for(int i = 0;i<=10;i++)
			{
				System.out.println("[Hello World] : "+t+" : "+i);
				t.sleep(500);
			}
		}
		catch (InterruptedException e)
		{
			System.out.println(e);
		}
		 System.out.println("Exiting "+t);
	}
}

class HelloWorldThread
{
	public static void main(String []args)
	{
		NewThread obj = new NewThread("First Thread");
		NewThread obj2 = new NewThread("Second Thread");
		
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

/*Sample Output
New thread created : Thread[First Thread,5,main]
New thread created : Thread[Second Thread,5,main]
[Hello World] : Thread[First Thread,5,main] : 0
[Hello World] : Thread[Second Thread,5,main] : 0
[Hello World] : Thread[First Thread,5,main] : 1
[Hello World] : Thread[Second Thread,5,main] : 1
[Hello World] : Thread[Second Thread,5,main] : 2
[Hello World] : Thread[First Thread,5,main] : 2
[Hello World] : Thread[Second Thread,5,main] : 3
[Hello World] : Thread[First Thread,5,main] : 3
[Hello World] : Thread[First Thread,5,main] : 4
[Hello World] : Thread[Second Thread,5,main] : 4
[Hello World] : Thread[First Thread,5,main] : 5
[Hello World] : Thread[Second Thread,5,main] : 5
[Hello World] : Thread[First Thread,5,main] : 6                                                                         
[Hello World] : Thread[Second Thread,5,main] : 6
[Hello World] : Thread[First Thread,5,main] : 7
[Hello World] : Thread[Second Thread,5,main] : 7
[Hello World] : Thread[Second Thread,5,main] : 8
[Hello World] : Thread[First Thread,5,main] : 8
[Hello World] : Thread[First Thread,5,main] : 9
[Hello World] : Thread[Second Thread,5,main] : 9
[Hello World] : Thread[First Thread,5,main] : 10
[Hello World] : Thread[Second Thread,5,main] : 10
Exiting Thread[First Thread,5,main]
Exiting Thread[Second Thread,5,main]
Exiting main thread
*/