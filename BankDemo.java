
import java.util.*;

class RBI
{
    protected double interestRate=4.0;
    public double getInterestRate()
    {
        return interestRate;
    }
}

class SBI extends RBI
{
    public double getInterestRate()
    {
        return 4.5;
    }
}

class ICICI extends RBI
{
    public double getInterestRate()
    {
        return 5.0;
    }
}

class PNB extends RBI
{
    public double getInterestRate()

    {
        return 6.0;
    }
}

class Account 
{
    private String accountHolderName;
    private RBI bank;

    public Account(String accountHolderName,RBI bank)
    {
        this.accountHolderName=accountHolderName;
        this.bank=bank;
    }

    public void displayInterestRate()
    {
        System.out.println(accountHolderName+" 's bank:"+bank);
        System.out.println("Interest Rate :"+bank.getInterestRate()+"%");
    }

}


public class BankDemo {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter account holders names:");
        String accountHolderName1=sc.nextLine();
        String accountHolderName2=sc.nextLine();
        RBI rbi=new RBI();
        SBI sbi=new SBI();
        ICICI icici=new ICICI();
        PNB pnb=new PNB();
        Account account1=new Account(accountHolderName1, rbi);
        Account account2=new Account(accountHolderName2, pnb);
        account1.displayInterestRate();
        account2.displayInterestRate();
        System.out.println("enter the bank name to find the rate of interest");
        String bankName=sc.nextLine().toUpperCase();
        switch(bankName)
        {
            case "RBI":
            Account accountRBI = new Account(accountHolderName1, rbi);
            accountRBI.displayInterestRate();
            break;
        case "SBI":
            Account accountSBI = new Account(accountHolderName1, sbi);
            accountSBI.displayInterestRate();
            break;
        case "ICICI":
            Account accountICICI = new Account(accountHolderName1, icici);
            accountICICI.displayInterestRate();
            break;
        case "PNB":
            Account accountPNB = new Account(accountHolderName1, pnb);
            accountPNB.displayInterestRate();
            break;
        default:
            System.out.println("Invalid bank name.");
    }

    sc.close();

        }

        
}
