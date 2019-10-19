public class SavingsAccount
{
    private static double annualInterestRate;

    private double savingsBalance;

    public SavingsAccount(double amount)
    {
        this.savingsBalance = amount;
    }

    public void calculateMonthlyInterest()
    {
        double interest;
        interest = (this.savingsBalance * (annualInterestRate/100))/12;
        this.savingsBalance += interest;
    }

    public void currentBalance()
    {
        System.out.printf("$%.2f", this.savingsBalance);
    }

    public static void modifyInterestRate(double rate)
    {
        annualInterestRate = rate;
    }
}
