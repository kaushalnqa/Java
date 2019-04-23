//Java Program to find the frequency of each element in the array

class findFrequencyOfElement{
	
	public static int a [] = {1,2,6,3,7,5,3,7,6,0};
	public static int ff[][] = new int [a.length][a.length];
	public static int ffrcnt=0;
	public static void main (String[] args)
	{
			initializeFF(ff);
			System.out.println(" Array element of A : \n");
			printArray(a);
			findFrequency(a);
			printFF(ff);
			
	}
	
	public static void findFrequency(int a[])
	{
		boolean status;
		for (int i=0;i<a.length;i++)
		{
			int cnt =0;
			for (int j=0;j<a.length;j++)
			{
				if (a[i] == a[j])
				{
					cnt++;
				}
			}
			status = ifExistinFF(a[i]);
			if (status == false)
			{
				injectInToFF(a[i],cnt,ffrcnt);
				ffrcnt++;
			}
			else
			{
				continue;
			}
			
		}
	}
	
	public static void injectInToFF( int val, int frequency, int counter)
	{
		ff[counter][0] = val;
		ff[counter][1] = frequency;
	}
	public static boolean ifExistinFF(int a)
	{
		boolean isExist = false;
		for (int i=0;i<ff.length;i++)
		{
			if (ff[i][0] == a)
			{
				return true;
			}
		}
		return false;
	}
	public static void initializeFF (int a[][])
	{
		for (int i=0;i<a.length;i++)
		{
			for (int j=0;j<2;j++)
			{
				a[i][j] = -1;
			}
		}
		
			
	}
	
	public static void printFF (int a[][])
	{
		System.out.println("\n\nFrequency of Elements are : \n ");
		System.out.println("Element \t Frequency ");
		for (int i=0;i<a.length;i++)
		{
			
			for (int j=0;j<2;j++)
			{ 
		       if (a[i][1] > 0)
			   {
					System.out.print( " " + a[i][j]);
					System.out.print("\t\t");
			   }
			}
			System.out.println();
		}
					
	}
	
	
	public static void printArray(int a[])
	{
		for (int i=0;i<a.length;i++)
		{
			System.out.print(" " + a[i]);
		}
	}
	
	
}