// Aim : Write a program that uses this keywas as argument for function
class thiskeywordasarguement{
	
	public void print()
	{
		display(this);
	}
	public void display( thiskeywordasarguement obj)
	{
		System.out.println(" Object passed as arguement.");
	}
	public static void main(String[] args)
	{
		thiskeywordasarguement t1 = new thiskeywordasarguement();
		t1.print();
	}
	
}