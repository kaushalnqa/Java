//Aim : Write a java program to add two multidimensional matrices.


class multiplyTwoMatrix{
	
	public static void main (String[] args)
	{
		int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int b[][] = {{1,1,1},{2,2,2},{3,3,3}};
		int c[][] = new int [3][3] ;
		System.out.println("\nElements of Array A:\n");
		printArray(a);
		System.out.println("\nElements of Array B:\n");
		printArray(b);
		System.out.println("\nSum of Both Arrays is as below :\n");
		for (int i =0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				c[i][j]= a[i][j] * b[i][j];
			}
		}
		printArray(c);
	}
	
	public static void printArray(int x[][])
	{
		for (int i =0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(" "+x[i][j]+" ");
			}
			System.out.println();
		}
	}
}