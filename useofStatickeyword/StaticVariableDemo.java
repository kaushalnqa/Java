// Aim : Write a Java Program to demonstrate the use of static variable  

class Account {

	long accountId;
	String Name;
	static String Branch ="Maninagar";
	Account(long id,String x)
	{
		accountId = id;
		Name = x;
	}
	public void ShowDetail()
	{
		System.out.println("Account Id : "+ accountId);
		System.out.println("Account Holder's Name : " + Name);
		System.out.println("Branch : " + Branch);
	}
}

class StaticVariableDemo{
	
	public static void main(String[] args)
	{
		Account a1 = new Account(1,"Kaushal");
		Account a2 = new Account(2,"Dixit");
		a1.ShowDetail();
		a2.ShowDetail();
	}
}