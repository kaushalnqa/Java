class printMultiplicationTable {

	public static void main (String[] args)
	{
		printMultiplicationTable(5);
		printMultiplicationTable(7);
	}
	
	public static void printMultiplicationTable(int no)
	{
		System.out.println("Multiplication Table of " + no + " is as below:");
		for (int i =1;i<=10;i++)
		{
			System.out.println (no + " * " + i +" = " + (no*i));
		}
	}
}