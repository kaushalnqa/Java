//Write a program to print fibonacci series
class printFibonacciSeries{
	
	public static void main (String[] args)
	{
		int no = 8;
		printFibonaciSeries(no);
	}
	
	public static void printFibonaciSeries(int no) 
	{
		int cnt = 0;
		int next = 0;
		int prev = 0;
		int sum = 0;
		do 
		{
			if (cnt == 0)
			{
				System.out.println(cnt);
				prev = cnt;
			}
			else if(cnt ==1)
			{
				System.out.println(cnt);
				next = cnt;
			}
			else
			{
				sum = prev + next;
				System.out.println(sum);
				prev = next;
				next = sum;
			}			
			cnt++ ;
		} while (cnt <no);
	}
}