class findFactorialofNoWithRecursion{
	
	
	public static void main (String[] args)
	{
		int ans;
		ans = findFactorialofNoWithRecursion(5);
		System.out.println("Factorial of 5 is " + ans);
		ans = findFactorialofNoWithRecursion(10);
		System.out.println("Factorial of 10 is " + ans);
	}
	
	public static int findFactorialofNoWithRecursion(int no)
	{
		System.out.println("value of no is " + no);
		if ( no == 1)
		{
			System.out.println("value of no : " + no);
			return 1;
		}
		else 
		{
			return no * findFactorialofNoWithRecursion(no-1);
			
		}
		
		
	}
}