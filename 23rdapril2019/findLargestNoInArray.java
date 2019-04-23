// Aim : Java Program to print the largest element in an array

class findLargestNoInArray{
	
	public static void main(String[] args)
	{
		int a[] = {10,99,34,42,5,100,87,67,73,51} ;
		int maxno=a[0];
		for(int i=0;i<a.length;i++)
		{
			if (maxno < a[i])
			{
				maxno = a[i];
			}
		}
		System.out.println("Largest No in array is : " + maxno);
	}
}