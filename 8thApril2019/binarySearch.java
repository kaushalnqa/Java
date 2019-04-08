//Write a program to perform binary search
class binarySearch
{
	public static void main(String[] args)
	{
		int no[] = {10,20,34,23,15,5,25,18,30,45};
		int start,length,searchno;
		System.out.println("Array Before Sorting :");
		printArray(no);
		no = sort(no);
		System.out.println("\nArray After Sorting :");
		printArray(no);
		start =0;
		length = (no.length -1);
		searchno = 2;
		bSearch(no,start,length,searchno);
	}
	public static void bSearch(int a[],int start,int len,int no)
	{
		int low = start;
		int high = len;
		int mid = (low + high)/2;
		if (low > high)
		{
			System.out.println("Element not found!!");
		}
		while (low <= high)
		{
			if ( a[mid] == no)
			{
				System.out.println("\n"+ no + " found at " + mid + "position.");
				break;
			}
			else if (a[mid] > no )
			{
				high = mid - 1;
			}
			else
			{
				low = mid + 1;
			}
			mid = (low + high)/2;
		}
		System.out.println("\nElement not found");
	}
	public static int[] sort(int a[])
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
		return a;
	}
	public static void printArray(int no[])
	{
		for (int i=0;i<no.length;i++)
		{
			System.out.print(" "+ no[i] + " ");
		}
	}
}