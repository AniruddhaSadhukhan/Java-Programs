
/*Create a class Date. Declare the variables month, day, year as private and create appropriate
constructor. Check the condition for exception. If the date is valid, it will proceed the program
otherwise display the exception “InvalidDate”. Provide method for checking if the year is
leap year or not and method to return the next date. Define method compareTo() to compare
two date. Use value returned by compareTo() method to check whether the a date is before or
after than other date in methods isBefore() and isAfter()[Use Boolean type for method to
return the values as either true or false]. Test your code. [ date o/p format: dd-mm-yyyy ].
*/
//		by Aniruddha

class InvalidDateException extends Exception
{
	Date a;
	InvalidDateException(Date d)
	{
		a=d;
	}
	public String toString()   
    	{
        return "InvalidInputException["+a+"]";
    	}
}

class Date
{
	private int year;
    	private int month;
    	private int day;
    	
    	Date(int d, int m, int y) throws InvalidDateException 
    	{
        	day = d;
        	month = m;
        	year = y;
        
        	if (! isValid())
            		throw new InvalidDateException(this);
    	}
    	
    	private boolean isValid() 
    	{
		int[] months = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		if ((year % 4) == 0 && ((year % 100) != 0 || (year % 400) == 0))
		    	months[1]++;
	
		return (1 <= month && month <= 12) && (1 <= day && day <= months[month-1]);
    	}
    	
    	public Date nextDay()throws InvalidDateException
    	{
        	int[] months = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        	if ((year % 4) == 0 && ((year % 100) != 0 || (year % 400) == 0))
		    	months[1]++;
        	
        	int maxDays = months[month-1];
        	
        	if (day < maxDays) 
            		return new Date(day+1,month,year);
        	else if (month == 12) 	
            		return new Date(1,1,year+1);
         	else 
            		return new Date(1,month+1,year);
	}
	
	int compareTo(Date d) 
	{
        	if (year < d.year)
            		return -1;
        	else if (year > d.year)
            		return 1;
        	else 
        	{
            		if (month < d.month)
                		return -1;
            		else if (month > d.month)
                		return 1;
            		else 
            		{
                		if (day < d.day)
                    			return -1;
                		else if (day > d.day)
                    			return 1;
                		else
                    			return 0;
           	 	}  
           	 }
	}   
    	
    	boolean isBefore(Date d) 
    	{
        	return compareTo(d) == -1;
    	}
    	
    	boolean isAfter(Date d) 
    	{
        	return compareTo(d) == 1;
    	} 	
    	
    	public String toString()
    	{
    		return String.format("%02d-%02d-%d", day, month, year);
    	}
}

class DateMain
{
	public static void main(String args[])
	{	
		
		try 
		{
            		Date[] db = {
					new Date(30,04,2017),
					new Date(10,02,2017),
					new Date(31,12,2017),
					new Date(28,2,2016),
					new Date(28,2,2017),
					new Date(10,02,2017),
            			};
            		for (Date d : db) 
            		{
                		Date t = d.nextDay();
                		System.out.println("[*] Today : "+d+" Tomorrow : "+t);
            		}
            		
            		System.out.println(db[0]+ (db[0].isBefore(db[1])?" is before ":" is not before ")+db[1]);
            		System.out.println(db[2]+ (db[2].isAfter(db[3])?" is after ":" is not after ")+db[3]);
            		System.out.println(db[1]+ (db[1].compareTo(db[5])==0?" is same as ":" is not same as ")+db[5]);
		}
		catch (InvalidDateException e) 
		{
            		System.out.println(e);
        	}
	}
}

/*Sample Output
[*] Today : 30-04-2017 Tomorrow : 01-05-2017
[*] Today : 10-02-2017 Tomorrow : 11-02-2017
[*] Today : 31-12-2017 Tomorrow : 01-01-2018
[*] Today : 28-02-2016 Tomorrow : 29-02-2016
[*] Today : 28-02-2017 Tomorrow : 01-03-2017
[*] Today : 10-02-2017 Tomorrow : 11-02-2017
30-04-2017 is not before 10-02-2017
31-12-2017 is after 28-02-2016
10-02-2017 is same as 10-02-2017

*/
