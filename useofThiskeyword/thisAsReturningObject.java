// Aim : Write a program which demostrates use of this keyword as returning object 

class thisAsReturningObject{

	thisAsReturningObject getObject()
	{
		return this;
	}
	
	public void displayData()
	{
		System.out.println("Hello from function");
	}
	
	public static void main(String[] args)
	{
		new thisAsReturningObject().getObject().displayData();
	}

}