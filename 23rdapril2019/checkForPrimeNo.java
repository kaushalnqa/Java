
// Aim : Write a program to check whether given no is prime number or not.

class checkForPrimeNo {

	public static void main (String[] args)
	{
		int no;
		no = 44;
		validateNoForPrime(no);
		no = 7;
		validateNoForPrime(no);
	}
	public static void validateNoForPrime(int no)
	{
		int cnt=1;
		int dcnt=0;
		while (cnt != no)
		{
			if ( (no % cnt) == 0)
			{
				dcnt++;
			}
			cnt ++;
		}
		if (dcnt > 2)
		{
			System.out.println( no + " is not prime number.");
		}
		else
		{
			System.out.println( no + " is prime number.");
		}
	}
}