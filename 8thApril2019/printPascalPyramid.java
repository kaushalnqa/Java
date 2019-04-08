//Write a program to print pascal pyramid

class printPascalPyramid
{
	public static void main(String[] args)
	{
		int no = 5;
		printPasPyramid(no);
	}
	
	public static void printPasPyramid(int a)
	{
		int l =40;
		for (int i=1;i<a;i++)
		{
			int j;
			for (int no=l;no>0;no--) //loop for setting space before printing no from left margin
			{
				System.out.print(" ");
			}
			for (j=1;j<i;j++) // loop for printing no 
			{
				
				System.out.print(j);
								
			}
			for (int k=j;k>0;k--) // loop for priting no in reverse order
			{
				System.out.print(k);
			}
			System.out.println();
			l = l-1;
			
		}
			
	}
}