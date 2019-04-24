// Aim : Write a java program to transpose a matrix.

class transposeMatrix{
	
	public static void main(String[] args)
	{
		int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println("\n Elements of Matrix A before Transpose:\n");
		printArray(a);
		a=transposeArray(a);
		System.out.println("\n Elements of Matrix A After Transpose:\n");
		printArray(a);
	}
	public static int[][] transposeArray(int x[][])
	{
		int tmp[][] = new int [3][3];
		for (int i =0;i<3;i++)
		{
			for (int j=0;j<3;j++)
			{
				tmp[i][j] = x[j][i];
			}
		}
		return tmp;
	}
	public static void printArray(int x[][])
	{
		for(int i=0;i<3;i++)
		{
			for (int j=0;j<3;j++)
			{
				System.out.print(" " + x[i][j]);
			}
			System.out.println();
		}
	}
}