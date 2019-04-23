// Aim : Write a program to sort the numbers in array using bubble sort algorithm.

class insertionSort {
	
	public static void main (String[] args)
	{
		int no[] = {1,4,2,5,6,3,9,7,0,8};
		System.out.println("Before Sorting array elements are like : ");
		printArray(no);
		no = insertionSorting(no);
		System.out.println("\n After sorting array elements are like : ");
		printArray(no);
	}
	
	public static int [] insertionSorting (int a[])
	{
		for (int i=1;i<a.length;i++)
		{
			int val = a[i];
			int j = i-1;
			while ( (j> -1) && (a[j] > val))
			{
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = val ;
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