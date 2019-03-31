class findFactorsofNo{

	public static void main (String[] args)
	{
		findFactorsofNo(5);
		findFactorsofNo(10);
	}
	
	public static void findFactorsofNo(int no)
	{
		System.out.println("Factors of give no are as : ");
		for (int i=1;i<=no;i++)
		{
			if (no%i == 0)
			{
				System.out.println(i);
			}
		}
	}
}