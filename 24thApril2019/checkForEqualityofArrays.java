//Aim : Write a Program to determine whether two matrices are equal

class checkForEqualityofArrays{
	
	public static void main(String[] args)
	{
		int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int b[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int c[][] = {{1,2},{4,5}};
		int d[][] = {{1,2,4},{4,5,6},{7,8,9}};
		System.out.println("\n Elements of Array A:\n");
		printArray(a);
		System.out.println("\n Elements of Array B: \n");
		printArray(b);
		checkforEquality(a,b);
		System.out.println("\n Elements of Array A:\n");
		printArray(a);
		System.out.println("\n Elements of Array C:\n");
		printArray(c);
		checkforEquality(a,c);
		System.out.println("\n Elements of Array B: \n");
		printArray(b);
		System.out.println("\n Elements of Array D: \n");
		printArray(d);
		checkforEquality(b,d);
	}
	
	public static void checkforEquality( int x[][],int y[][])
	{
		int xcol = x[0].length;
		int xrow = x.length;
		int ycol = y[0].length;
		int yrow = y.length;
		int cnt =0;
		boolean flag = false;
		if ( xcol != ycol && xrow != yrow)
		{
			System.out.println("\nBoth Arrays are not equal.");
		}
		else
		{
			System.out.println("\nArray size is equal and checking for data similarity...");
			for ( int i=0;i<xrow;i++)
			{
				for (int j=0;j<xcol;j++)
				{
					if (x[i][j] == y[i][j])
					{
						cnt++;
					}
					else
					{
						cnt--;
					}
				}
			}
			if (cnt ==9)
			{
				System.out.println("\nBoth Arrays are equal.");
			}
			else
			{
				System.out.println("\nArray contains different data. So Both arrays are different.");
			}
		}
	}
	public static void printArray(int temp[][])
	{
		int col = temp[0].length;
		int row = temp.length;
		for (int i =0;i<row;i++)
		{
			for(int j =0;j<col;j++)
			{
				System.out.print(" "+ temp[i][j]);
			}
			System.out.println();
		}
	}
}