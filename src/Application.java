public class Application
{
    public static void main(String[] args){
        SavingsAccount saver1 = new SavingsAccount(2000.0);
        SavingsAccount saver2 = new SavingsAccount(3000.0);
        SavingsAccount.modifyInterestRate(4.0);

        System.out.println("Interest rate set to 4%.");
        System.out.println();
        System.out.println("Month \t\t Saver1 \t Saver2");

        for(int i = 1; i <= 12; ++i)
        {
            String month;

            switch (i)
            {
                case 1:
                    month = "January  ";
                    break;
                case 2:
                    month = "February ";
                    break;
                case 3:
                    month = "March    ";
                    break;
                case 4:
                    month = "April    ";
                    break;
                case 5:
                    month = "May      ";
                    break;
                case 6:
                    month = "June     ";
                    break;
                case 7:
                    month = "July     ";
                    break;
                case 8:
                    month = "August   ";
                    break;
                case 9:
                    month = "September";
                    break;
                case 10:
                    month = "October  ";
                    break;
                case 11:
                    month = "November ";
                    break;
                default:
                    month = "December ";
                    break;
            }
            System.out.print(month);
            saver1.calculateMonthlyInterest();
            saver2.calculateMonthlyInterest();
            System.out.print("\t");
            saver1.currentBalance();
            System.out.print("\t");
            saver2.currentBalance();
            System.out.println();
        }
        System.out.println();

        System.out.println("Interest rate changed to 5%.");
        System.out.println();
        SavingsAccount.modifyInterestRate(5.0);

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.print("Next month \t");
        saver1.currentBalance();
        System.out.print("\t");
        saver2.currentBalance();
    }
}
