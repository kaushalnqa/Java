//print two dimension array
class printTwoDimensionArray{
	
	public static void main(String[] args)
	{
		int no [][] = {{1,2},{3,4},{5,6}};
		for(int i =0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(" "+no[i][j] +" ");
			}
			System.out.println();
		}
	}
}