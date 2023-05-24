package JavaPractical;
import java.util.*;
class ATMDemo
{
	void BankATM()
	{
		Scanner rz=new Scanner(System.in);
		int fixed_pin=4893;
		System.out.println("Namaste.\nWelcome To SANREEZ Bank's ATM");
		System.out.println("Enter the PIN");
		int new_pin=rz.nextInt();
		if(fixed_pin==new_pin)
		{
		int money=5000000;
		int withdraw;
		int collection;
		System.out.println("Please Choose The Operation You Want To Execute: ");
		System.out.println("\n1.Deposit\n2.Withdraw\n3.Blance Query\n4.Exit");
		int choice=rz.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("Enter the money you want to Deposit:-");
			collection =rz.nextInt();
			money=money+collection;
			System.out.println("Your Current balance is "+money);
			break;
			
		case 2:
			System.out.println("Enter the money you want to Withdraw:-");
			withdraw =rz.nextInt();
			if(withdraw<money)
			{
			money=money-withdraw;
			System.out.println("Collect Your Money");
			System.out.println("Your Current balance is "+money+".");
			}
			else
			{
				System.out.println("Insufficent Balance.");
				System.out.println("Your Current balance is "+money+".");
			}
			break;
		case 3:
			System.out.println("Your Current balance is "+money+".");
			break;
		case 4:
			System.out.println("Thanks For Your Visit.\nPlease Visit Again In SANREEZ Bank.\nNamaste.");
			System.exit(0);
		}
		}
		else
		{
			System.out.println("You Have Entered Wrong PIN");
		}
	}
}

public class ATM {

	public static void main(String[] args) {
		
		ATMDemo rk=new ATMDemo();
		rk.BankATM();
	}

}
