//Aim : Write a program to determine whether a given matrix is an identity matrix

class isIdentityMatrixOrNot
{
	
	
	public static void main(String[] args)
	{
		int a[][] = {{1,0,0},{0,1,0},{0,0,1}};
		int b[][] = {{1,2,3},{4,5,6},{7,8,9}};
		boolean status;
		System.out.println("\n Array Elements of B are: \n");
		printArray(b);
		System.out.println("\n Checking for Identity Matrix or not .. \n");
		checkForIdentityMatrix(b);
		System.out.println("\n Array Elements of A are: \n");
		printArray(a);
		System.out.println("\n Checking for Identity Matrix or not .. \n");
		checkForIdentityMatrix(a);
		
	}
	
	public static void printArray(int a[][])
	{
		for (int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(" "+ a[i][j]);
			}
			System.out.println();
		}
	}
	public static void checkForIdentityMatrix(int tmp[][])
	{
		 int cnt =0;
		for (int i=0;i<3;i++)
		{
			for (int j=0;j<3;j++)
			{
				if(i==j && tmp[i][j] ==1)
				{
					cnt++;
				}
			}
		}
		if (cnt ==3)
		{
			System.out.println("\nGiven matrix is Identity Matrix.");
		}
		else
		{
			System.out.println("\nGiven matrix is not Identity Matrix.");
		}
	}
}