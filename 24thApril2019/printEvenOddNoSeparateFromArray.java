// Aim : Write a java program to print odd and even number from an array.

class printEvenOddNoSeparateFromArray
{
	
	public static void main(String[] args)
	{
		int a[] = {22,11,34,77,53,68,96,40,85,9};
		int even[] = new int[a.length];
		int odd[] = new int [a.length];
		int ecnt=0 ;
		int ocnt=0;
		System.out.println("\nElements of Array A : \n");
		printArray(a);
		for (int i =0;i<a.length;i++)
		{
			if ( a[i]%2 == 0)
			{
				even[ecnt]=a[i];
				ecnt++;
			}
			else
			{
				odd[ocnt]=a[i];
				ocnt++;
			}
		}
		System.out.println("\n\nEven Elements of Array A:\n");
		printArray(even,ecnt);
		System.out.println("\n\nOdd Elements of Array A:\n");
		printArray(odd,ocnt);
	}
	public static void printArray(int x[], int counter)
	{
		for (int i =0;i<counter;i++)
		{
			System.out.print(" " + x[i]);
		}
	}
	public static void printArray(int x[])
	{
		for(int i=0;i<x.length;i++)
		{
			System.out.print(" "+ x[i]);
		}
	}
}