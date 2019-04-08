//Write a program to check entered string is palindrom or not

class checkStringForPalindromOrNot
{
	
	public static void main (String[] args)
	{
		String str = "kanak";
		String revstr;
		revstr = checkForPalindrom(str);
		checkEquality(str,revstr);
		str = "Hello";
		revstr = checkForPalindrom(str);
		checkEquality(str,revstr);
	}
	public static void checkEquality (String a, String b)
	{
		if (a.equals(b)) 
		{
			System.out.println( a + " is palindrom.");
		}
		else
		{
			System.out.println( b + " is not palindrom.");
		}
	}
	
	public static String checkForPalindrom(String a)
	{
		String temp = "";
		for (int i=a.length()-1;i>=0;i--)
		{
			temp = temp + a.charAt(i); 
		}
		return temp;
	}
}