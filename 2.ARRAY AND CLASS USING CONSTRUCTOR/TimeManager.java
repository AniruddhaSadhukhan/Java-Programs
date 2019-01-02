import java.util.Calendar;

//Program to implement time
//	by Aniruddha

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
}	
class TimeManager
{
	public static void main(String args[])
	{
		Calendar cal = Calendar.getInstance();
		int hours,min,sec;
		hours= cal.get(Calendar.HOUR);
		min  = cal.get(Calendar.MINUTE);
		sec  = cal.get(Calendar.SECOND);
		Time ob = new Time(hours,min,sec);
		ob.display();
		
	}
	
}	
	
/*
8:34:18
*/	
