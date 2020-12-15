import java.util.Scanner;

public class BankingApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount obj=new BankAccount("sheela","2tg16ec038");
		obj.showMenu();

	}

}
class BankAccount{
	int Balance;
	int PreviousTrasaction;
	String CustomerName;
	String CustomerId;
	 BankAccount(String cname,String cid)
	{
		CustomerName=cname;
		CustomerId=cid;
	}
	void Deposit(int amount)
	{
		if(amount!=0)
		{
			Balance=Balance+amount;
			PreviousTrasaction=amount;
		}
	}
	void Withdraw(int amount)
	{
		if(amount!=0)
		{
			Balance=Balance-amount;
			PreviousTrasaction=-amount;
		}
	}
	void getTrasaction(){
		if(PreviousTrasaction>0)
		{
			System.out.println("Deposited"+PreviousTrasaction);
		}
		else if(PreviousTrasaction<0)
		{
			System.out.println("Withdraw:"+Math.abs(PreviousTrasaction));
		}
		else
		{
			System.out.println("No trasaction occured");
		}
		
	}
	void showMenu()
	{
		char option='\0';
		Scanner scanner=new Scanner(System.in);
		System.out.println("welcome"+CustomerName);
		System.out.println("your id"+CustomerId);
		System.out.println("\n");
		System.out.println("A:check your Balance");
		System.out.println("B:Deposit");
		System.out.println("C:withraw");
		System.out.println("D:PreviousTrasaction");
		System.out.println("Exit:EXit the system");
		
		do {
			System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=");
			System.out.println("enter your option");
			System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=");
			Scanner scan=new Scanner(System.in);
			option=scan.next().charAt(0);
			System.out.println("\n");
			switch(option)
			{
			case'A':
				System.out.println("----------------------------------");
				System.out.println("Balance is" +Balance);
				System.out.println("----------------------------------");
				break;
				
			case'B':
				System.out.println("----------------------------------");
				System.out.println("enter amount to deposit");
				System.out.println("----------------------------------");
				break;
				
			case'C':
				System.out.println("----------------------------------");
				System.out.println("enter amount to withdraw");
				System.out.println("----------------------------------");
				break;
				
			case'D':
				System.out.println("-------------------");
			getTrasaction();
			System.out.println();
				System.out.println("-------------------------------------");
				System.out.println("\n");
				
			case'E':
				System.out.println("-------------------");
				
				
				
				default:
					System.out.println("Invalid! potion please enter correct option");
					break;
			}
		}
		while(option !='E');
		System.out.println("thank you using our service");
		
	
	}
}
