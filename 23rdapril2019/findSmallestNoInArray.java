// Aim : Java Program to print the Smallest element in an array

class findSmallestNoInArray{
	
	public static void main(String[] args)
	{
		int a[] = {10,99,34,42,5,100,87,67,73,51} ;
		int minno=a[0];
		for(int i=0;i<a.length;i++)
		{
			if (minno > a[i])
			{
				minno = a[i];
			}
		}
		System.out.println("Smallest No in array is : " + minno);
	}
}