import java.util.Scanner;

/*Write an abstract class Worker and derive classes DailyWorker and SalariedWorker from it.
Every worker has a name and a salary rate. Write an abstract method comPay( ) to compute
the weekly pay of every worker. A DailyWorker is paid on the basis of number of days which
is to be calculated from the hours he/she works weekly. The SalariedWorker gets paid the
wage for a week no matter what actual hours are. Test this program to calculate the weekly
pay of workers. Use concept of dynamic polymorphism to write this program.*/
//			by Aniruddha

abstract class Worker
{
	String name;
	float rate;
	Worker(String n,float r)
	{
		name = n;
		rate = r;
	}
	
	abstract float comPay();
}

class DailyWorker extends Worker
{
	private int hours;
	DailyWorker(String n,float r,int h)
	{
		super(n,r);
		hours = h;
	}
	public float comPay()
	{
		int days=hours/24;
		return rate*days;
	}
}

class SalariedWorker extends Worker
{
	private int hours;
	SalariedWorker(String n,float r,int h)
	{
		super(n,r);
		hours = h;
	}
	public float comPay()
	{
		int weeks=hours/(24*7);
		return rate*weeks;
	}
}

class Work
{
	public static void main(String args[])
	{
		String name;
		float rate;
		int time;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter Daily Worker name: ");
		name = in.nextLine();
		System.out.print("Enter rate per day: ");
		rate = in.nextFloat();
		System.out.print("Enter number of hours: ");
		time = in.nextInt();
		DailyWorker dw = new DailyWorker(name,rate,time);
		System.out.println("Salary: "+dw.comPay()+"\n\n");
		

		in.nextLine();
		System.out.print("Enter Salaried Worker name: ");
		name = in.nextLine();
		System.out.print("Enter rate per week: ");
		rate = in.nextFloat();
		System.out.print("Enter number of hours: ");
		time = in.nextInt();
		SalariedWorker sw = new SalariedWorker(name,rate,time);
		System.out.println("Salary: "+sw.comPay());
	}
}

/*Sample Output:
Enter Daily Worker name: Abc Def
Enter rate per day: 500
Enter number of hours: 50
Salary: 1000.0


Enter Salaried Worker name: Xyz Uvw
Enter rate per week: 5000
Enter number of hours: 350
Salary: 10000.0
*/		
