//Java Program to left rotate the elements of an array

class rotateArrayElementLeft {
	
	public static int a[] = {1,3,2,4,5,7,9,6,8,0};
	
	public static void main (String[] args)
	{
		System.out.println("Array before Rotating : \n");
		printArray(a);
		rotateElementLeftside(a);
		System.out.println("\n\nArray before Rotating : \n");
		printArray(a);
	}
	
	public static void rotateElementLeftside(int a[])
	{
		int temp;
		temp = a[0];
		for(int i=0;i<a.length;i++)
		{
			if (i != a.length-1)
			{
				a[i] = a[i+1];
			}
			else if ( i == a.length-1)
			{
				a[i] = temp;
			}
			else 
			{
				continue;
			}
			
		}
	}
	
	public static void printArray(int a[])
	{
		for (int i =0;i<a.length;i++)
		{
			System.out.print(" " + a[i]);
		}
	}
}