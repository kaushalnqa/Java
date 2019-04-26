//Aim : Java Program to right rotate the elements of an array

class rotateArrayElementRight{
	
	public static int a[] = {10,23,43,11,46,7,2,67,73,94};
	public static void main(String[] args)
	{
		System.out.println("\n Array Elements Before Rotating Right : \n");
		printArray(a);
		System.out.println("\n\n Rotating Element Right...\n");
		rotateArrayElemRight(a);
		System.out.println("\n\n Array Elements After Rotating Right : \n");
		printArray(a);
	}
	
	public static void rotateArrayElemRight(int a[])
	{
		int temp=0;
		int nextno = 0;
		int curno=0;
		int prevno=0;
		temp = a[a.length-1];
		for (int i =0;i<a.length;i++)
		{
			
			if (i == 0)
			{   
		        curno = a[i];
				nextno = a[i+1];
				a[i] = temp;
				
			}
			else if (i < a.length-1)
			{
				prevno = curno;
				curno = a[i];
				nextno = a[i+1];
				a[i] = prevno;
				
			}
			else
			{
				a[i] = curno;
				
			}
		}
	}
	
	public static void printArray(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(" "+ a[i]);
		}
	}
}