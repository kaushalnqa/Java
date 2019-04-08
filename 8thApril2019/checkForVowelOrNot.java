//Write a program to check whether entered character is vowel or consonant
class checkForVowelOrNot{
	
	public static void main (String [] args)
	{
		char c;
		c = 'a';
		checkcharIsVowelOrNot(c);
		c = 'd';
		checkcharIsVowelOrNot(c);
	}
	
	public static void checkcharIsVowelOrNot(char c)
	{
		if (c == 'a' || c== 'e' || c== 'i' || c== 'o' || c=='u')
		{
			System.out.println(c + " character is vowel.");
		}
		else
		{
			System.out.println(c + " character is consonant.");
		}
	}
}