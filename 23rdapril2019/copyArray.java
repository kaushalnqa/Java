//Java Program to copy all elements of one array into another array

class copyArray{
	
	public static void main (String [] args)
	{
			int a [] = {11,23,43,56,26,7,12,78,65,99,0};
			System.out.println(" Array elements of A : \n");
			printArray(a);
			int b [] = new int [a.length];
			for ( int i=0;i<a.length;i++)
			{
				b[i] = a[i];
			}
			System.out.println(" \n \n Array elements of B after copying from of A array: \n");
			printArray(b);
	}
	
	public static void printArray(int a[])
	{
		for (int i = 0; i < a.length;i++)
		{
			System.out.print(" " + a[i]);
		}
	}
	
}