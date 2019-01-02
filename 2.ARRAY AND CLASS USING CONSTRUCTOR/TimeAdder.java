import java.util.Scanner;

//Program to add time
// by Aniruddha
class Time
{
	int hours,min,sec;
	
	Time(int h,int m,int s)
	{
		hours=h;
		min=m;
		sec=s;
	}
	
	void display()
	{
		System.out.println(hours+":"+min+":"+sec);
	}
	
	void add(Time x,Time y)
	{
		sec=(x.sec+y.sec)%60;
		min=((x.min+y.min) + (x.sec+y.sec)/60)%60;
		hours=((x.hours +y.hours) + (x.min+y.min)/60);
		
	}
}	

class TimeAdder
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		
		int hours,min,sec;
		
		System.out.println("Enter first time:");
		System.out.print("Hours:");
		hours=in.nextInt();
		System.out.print("Min:");
		min=in.nextInt();
		System.out.print("Sec:");
		sec=in.nextInt();
		Time x = new Time(hours,min,sec);
		
		System.out.println("Enter second time:");
		System.out.print("Hours:");
		hours=in.nextInt();
		System.out.print("Min:");
		min=in.nextInt();
		System.out.print("Sec:");
		sec=in.nextInt();
		Time y = new Time(hours,min,sec);
		
		Time z = new Time(0,0,0);
		z.add(x,y);
		z.display();
		
	}
	
}	

/*
Enter first time:
Hours:9
Min:45
Sec:52
Enter second time:
Hours:15
Min:25
Sec:16
25:11:8

*/		
