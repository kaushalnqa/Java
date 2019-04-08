//Write a program to implement selection sort for array element
class selectionSort{
	
	public static void main(String[] args)
	{
		int no[] = {10,20,34,23,15,5,15,18,30,45};
		int min =0;
		System.out.println();
		System.out.println("Before sorting  array elements : ");
		printArray(no);
		no = sort(no,'a');
		System.out.println();
		System.out.println(" \nArray elements after Sorting in Ascending : ");
		printArray(no);
		no = sort(no,'d');
		System.out.println();
		System.out.println(" \nArray elements after Sorting in Decending : ");
		printArray(no);
		System.out.println();
	}
	public static int[] sort(int a[],char ch)
	{
		if (ch == 'a')
		{
			for (int i=0;i<a.length;i++)
			{
				
				for (int j=0;j<a.length;j++)
				{
					if (a[j] > a[i])
					{
						int temp;
						temp = a[i];
						a[i] = a[j];
						a[j] = temp;
					}
				}
			}
		}
		else
		{
			for (int i=0;i<a.length;i++)
			{
				
				for (int j=0;j<a.length;j++)
				{
					if (a[j] < a[i])
					{
						int temp;
						temp = a[i];
						a[i] = a[j];
						a[j] = temp;
					}
				}
			}
		}
		return a;
	}
	
	public static void printArray(int a[])
	{
		for (int i=0;i<a.length;i++)
		{
			System.out.print(" " + a[i] +" ");
		}
	}
}