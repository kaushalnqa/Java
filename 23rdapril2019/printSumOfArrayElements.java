// Aim : Java Program to print the sum of all the items of the array

class printSumOfArrayElements{
	
	public static void main(String[] args)
	{
		int a [] = {10,2,34,56,78,99,23,44,81,67};
		int sum = 0;
		for (int i=0;i<a.length;i++)
		{
			sum = sum + a[i];
		}
		System.out.println("Total sum of Array Element is : " + sum);
	}
}