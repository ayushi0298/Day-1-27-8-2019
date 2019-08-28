
public class BankAccounts {
	
	private int account_number; 
	private String name; 
	private int balance; 
	private String account_type;
	private static int total_withdrwal;
	private  static int total_deposit;
	private   int sum_Withdrwal;
	private   int sum_Deposit;

	public BankAccounts(int account_number, String name, int balance,String account_type) {
		this.account_number = account_number;
		this.name = name;
		this.balance = balance;
		this.account_type= account_type;
	}
	
	public void account_details()
	{
		System.out.println(account_number+" is account number "+name+" is  name "+balance+" is balance "+account_type+" is account type  ");
	}
	public void withdrawl(int withdrawl)
	{
		sum_Withdrwal=0;
		balance= balance- withdrawl;
		System.out.println(balance+" NEW BALANCE");
		total_withdrwal++;
		sum_Withdrwal= sum_Withdrwal+ balance;
	}
	public static void countNumber()
	{
			System.out.println("TOTAL WITHDRWALS ARE "+ total_withdrwal+" TOTAL DEPOSITS ARE "+ total_deposit);
	
	}
	public  void countAmount()
	{
			System.out.println("AMOUNT AFTER WITHDRAWL "+sum_Withdrwal+ "AMOUNT AFTER DEPOSIT "+sum_Deposit);
	
	}
	public void deposit(int deposit)
	{
		sum_Deposit=0;
		balance= balance + deposit;
		System.out.println(balance+" NEW BALANCE");
		total_deposit++;
		sum_Deposit= sum_Deposit+ balance;
		
	}
	public static void averageSalary(BankAccounts...temp)
	{
		int total=0;
		for(BankAccounts b: temp)
		{
			total+=b.balance;
		}
		System.out.println("Average balance "+total/temp.length);
	}
	
	public static void main(String[] args) {
		BankAccounts a1= new BankAccounts(101,"B",6000,"SAVINGS");
		BankAccounts a2= new BankAccounts(102,"C",5000,"CURRENT");

		a1.account_details();
		a2.account_details();
		
		a1.withdrawl(200);
		a2.withdrawl(100);
		
		a1.deposit(200);
		a2.deposit(100);
		
		averageSalary(a1,a2);
		countNumber();
		a1.countAmount();
		a2.countAmount();
		
		
	}

}
