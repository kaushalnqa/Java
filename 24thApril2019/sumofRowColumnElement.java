//Aim : Write a java program to find the sum of each row and each column of a matrix

class sumofRowColumnElement
{
	
	public static void main(String[] args)
	{
		int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int ecnt=0;
		int ocnt=0;
		System.out.println("\n Elements of Array A: \n");
		printArray(a);
		findSum(a);
	}
	
	public static void findSum(int tmp[][])
	{
		int row = tmp.length;
		int col = tmp[0].length;
		
		int ocnt = 0;
		for(int i=0;i<row;i++)
		{
			int sum = 0;
			for (int j=0;j<col;j++)
			{
				sum = sum + tmp[i][j];
			}
			System.out.println("\nSum of " + i +"th Row is : "+ sum);
		}
		for(int i=0;i<row;i++)
		{
			int sum = 0;
			for (int j=0;j<col;j++)
			{
				sum = sum + tmp[j][i];
			}
			System.out.println("\nSum of " + i +"th Column is : "+ sum);
		}		
	}
	public static void printArray(int tmp[][])
	{
		int row = tmp.length;
		int col = tmp[0].length;
		for(int i=0;i<row;i++)
		{
			for (int j=0;j<col;j++)
			{
				System.out.print(" " + tmp[i][j]);
			}
			System.out.println();
		}
	}
}