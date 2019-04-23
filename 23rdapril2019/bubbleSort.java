// Aim : Write a program to sort the numbers in array using bubble sort algorithm.

class bubbleSort {
	
	public static void main (String[] args)
	{
		int no[] = {1,4,2,5,6,3,9,7,0,8};
		System.out.println("Before Sorting array elements are like : ");
		printArray(no);
		no = bubbleSorting(no);
		System.out.println("\n After sorting array elements are like : ");
		printArray(no);
	}
	
	public static int [] bubbleSorting (int a[])
	{
		int temp = 0;
		for (int i =0; i < a.length;i++)
		{
			for (int j =0;j < a.length -i-1;j++)
			{
				if ( a[j] > a[j+1])
				{
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		return a;
	}
	
	public static void printArray(int a[])
	{
		for (int i =0;i<a.length;i++)
		{
				System.out.print(" " + a[i]);
		}
	}
}