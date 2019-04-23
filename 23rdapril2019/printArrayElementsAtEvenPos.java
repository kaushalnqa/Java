// Aim : Java Program to print the elements of an array present on even position

class printArrayElementsAtEvenPos{
	
	public static void main (String[] args)
	{
		int a[] = {23,42,11,5,7,27,88,75,32,49} ;
		System.out.println("Elements of an array present on even position : ");
		for(int i=0;i<a.length;i++)
		{
			if (i%2 == 0)
			{
				System.out.println("a["+i+"]=" + a[i]);
			}	
		}
	}
	
}