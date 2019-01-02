package Banking;

import Banking.Loan.*;

/*Write a program to make a package Banking in which has an abstract class “Account” with
displayBalance() method in it. Create a class “SavingsAccount extending Account with daily
withdrawal limit” of Rs 15000. The minimum balance for “SavingsAccount” is Rs 1000. A
penalty of Rs 20 will be deducted on the next deposit if account balance reaches less than the
minimum balance. Create another class “LoanAccount” inherited from “SavingsAccount”
inside Loan package where loan amount will be added to savings account balance and
monthly EMI will be deducted from savings account balance. Formula to calculate EMI =
P×r×(1 + r)n/((1 + r)n - 1) where, P is Principle Loan Amount, r is rate of interest calculated
in monthly basis it should be = Rate of Annual interest/12/100, n is tenure in number of
months. [Hint: For 100000 at 10% annual interest for a period of 12 months, r=
10/12/100=0.00833 it comes to 100000*0.00833*(1 + 0.00833)12/((1 + 0.00833)12 - 1) =
8792].*/
//			by Aniruddha

public class Main {
	public static void main(String[] args) 
	{
		LoanAccount la = new LoanAccount(100000, 0.1, 12);
		la.displayBalance();

		for(int i = 0; i < 12; i++) la.eliminateEMI();

		System.out.println("Balance after 1 yr: ");
		la.displayBalance();

		for(int i = 0; i < 12; i++) la.eliminateEMI();

		System.out.println("Balance after 2 yrs: ");
		la.displayBalance();

		la.deposit(10000);
		la.displayBalance();
	}
}

/*Sample Output
<<Ani>>javac Banking/Main.java 
<<Ani>>java Banking/Main
Aniruddha Sadhukhan
Balance: 100000
Withdrawn EMI: 908
Withdrawn EMI: 908
Withdrawn EMI: 908
Withdrawn EMI: 908
Withdrawn EMI: 908
Withdrawn EMI: 908
Withdrawn EMI: 908
Withdrawn EMI: 908
Withdrawn EMI: 908
Withdrawn EMI: 908
Withdrawn EMI: 908
Withdrawn EMI: 908
Balance after 1 yr: 
Aniruddha Sadhukhan
Balance: 89104
Withdrawn EMI: 908
Withdrawn EMI: 908
Withdrawn EMI: 908
Withdrawn EMI: 908
Withdrawn EMI: 908
Withdrawn EMI: 908
Withdrawn EMI: 908
Withdrawn EMI: 908
Withdrawn EMI: 908
Withdrawn EMI: 908
Withdrawn EMI: 908
Withdrawn EMI: 908
Balance after 2 yrs: 
Aniruddha Sadhukhan
Balance: 78208
Loan deposited successfully!
Aniruddha Sadhukhan
Balance: 68208

*/
