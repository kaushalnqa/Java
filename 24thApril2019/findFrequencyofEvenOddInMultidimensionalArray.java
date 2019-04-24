//Aim : Write a java program to find the frequency of odd & even numbers in the given matrix

class findFrequencyofEvenOddInMultidimensionalArray
{
	
	public static void main(String[] args)
	{
		int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int ecnt=0;
		int ocnt=0;
		System.out.println("\n Elements of Array A: \n");
		printArray(a);
		findFrequency(a);
	}
	
	public static void findFrequency(int tmp[][])
	{
		int row = tmp.length;
		int col = tmp[0].length;
		int ecnt = 0;
		int ocnt = 0;
		for(int i=0;i<row;i++)
		{
			for (int j=0;j<col;j++)
			{
				if(tmp[i][j]%2 == 0)
				{
					ecnt++;
				}
				else
				{
					ocnt++;
				}
			}
		}
		System.out.println("\n Odd Element count of Array are : " + ocnt);
		System.out.println("\n Even Element count of Array are : " + ecnt);
		
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