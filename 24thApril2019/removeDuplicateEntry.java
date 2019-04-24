// Aim : Write a java program to remove duplicate element in an array.

class removeDuplicateEntry
{
	public static int a[] = {1,2,4,3,9,3,6,4,5};
	public static int unique[] = new int [a.length];
	
	public static void main(String[] args)
	{
		
		System.out.println("\n Before removing duplicate entry Array elements of Array A: \n ");
		printArray(a,'O'); 
		initializeunique();
		System.out.println("\n\nRemoving Duplicate Numbers...");
		removeDupNo(a);
		System.out.println("\n After removing duplicate entry Array Elements of Array are : \n");
		printArray(unique,'N');
	}
	public static void removeDupNo(int a[])
	{
		boolean status = false;
		int tmpcnt = 0;
		for (int i =0;i<a.length;i++)
		{
			status = isExistinArray(a[i]);
			if (status == true)
			{
				continue;
			}
			else
			{
				unique[tmpcnt]=a[i];
				tmpcnt++;
			}
		}
	}

	public static boolean isExistinArray(int no)
	{
		for(int i=0;i<unique.length;i++)
		{
			if (unique[i] == no)
			{
					return true;
			}
		}
		return false;
	}
	
	public static void initializeunique()
	{
		for (int i = 0;i<unique.length;i++)
		{
			unique[i] = -1;
		}
	}
	public static void printArray(int temp[],char tmp)
	{
		if (tmp == 'O' || tmp == 'o')
		{
			for (int i =0;i<temp.length;i++)
			{
			System.out.print(" " + temp[i]);
			}
		}
		else
		{
			int cnt = 0;
			while (temp[cnt]!= -1)
			{
				System.out.print(" " + temp[cnt]);
				cnt ++;
			}
		}
		
	}
}