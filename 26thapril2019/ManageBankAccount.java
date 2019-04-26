//Aim : Write a Java Program to demonstrate the working of a banking-system  which provides deposit and withdraw functions to deposit and withdraw amount from account.  

class account{
	
	long accountNo;
	String cusName;
	double amount;
	
	public void setAccountDetails(long no, String name, double amt)
	{
		accountNo = no;
		cusName = name;
		amount = amt;
	}
	
	public void DepositeAmount(double damt)
	{
		amount = amount + damt;damt
	}
	
	public void showAccountBalance()
	{
		System.out.println("Current Balance is : " + amount);
	}
	
	public void WithDrawAmt(double wamt)
	{
		if (amount - wamt < 0)
		{
			System.out.println(" Insufficient balance. So your request couldn't be proccessed.");
		}
		else
		{
			System.out.println("Previous Balance is :" + amount);
			amount = amount - wamt;
			showAccountBalance();
		}
	}
	public void showAccountDetail()
	{
		System.out.println("\n Account Details is as below : \n");
		System.out.println("Account no : "+ accountNo);
		System.out.println("Customer Name : "+ cusName);
		System.out.println("Amount : " + amount);
	}
}

class ManageBankAccount{
	
	public static void main(String[] args)
	{
		
		account a = new account();
		a.setAccountDetails(100,"Kaushal", 30000);
		a.showAccountBalance();
		a.DepositeAmount(2000);
		a.WithDrawAmt(29000);
		a.WithDrawAmt(5000);
	}
}