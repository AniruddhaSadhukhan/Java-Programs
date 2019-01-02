package Banking;

public class Account {
	public int balance = 0;
	public int bal_limit = 1000;
	public int wth_limit = 15000;
	public String name = "Aniruddha Sadhukhan";

	public void displayBalance() 
	{
		System.out.println(name);
		System.out.println("Balance: " + balance);
	}
}
