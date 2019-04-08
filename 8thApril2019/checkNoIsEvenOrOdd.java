//Aim : Write a program to check whether no is odd or even
class checkNoIsEvenOrOdd
{
	public static void main (String[] args)
	{
		int no1=10;
		int no2=21;
		checkforEvenOrOdd(no1);
		checkforEvenOrOdd(no2);
	}
	
	public static void checkforEvenOrOdd(int no)
	{
		if (no%2==0)
		{
			System.out.println(no + " is even no.");
		}
		else
		{
			System.out.println(no + " is odd no.");
		}
	}	
}