class findFactorialofNo{

	public static void main (String[] args)
	{
		int ans = 0;
		ans = findFactorialofNo(5);
		System.out.println("Factorial of 5 is : " + ans);
		ans = findFactorialofNo(10);
		System.out.println("Factorial of 10 is : " + ans);
	}
	
	public static int findFactorialofNo(int no)
	{
		int result = 1;
		for(int i =1;i<=no;i++)
		{
			result = result * i;
		}	
		return result;
	}
}