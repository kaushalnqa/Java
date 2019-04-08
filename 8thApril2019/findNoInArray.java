//Write a program to find whether element is in array or not
class findNoInArray
{
	public static void main(String[] args)
	{
		int no[] = {1,2,3,4,5,6,7,8,9,10};
		int searchElement = 5;
		findNoinArray(no,searchElement);
		searchElement = 21;
		findNoinArray(no,searchElement);
	}
	
	public static void findNoinArray(int a[],int no)
	{
		int cnt =0;
		for (int i =0;i<a.length;i++)
		{
			if (a[i]==no)
			{
				System.out.println( no +" is found at " + i +"\'th position in array.");
				cnt ++;
			}
			
		}
		if (cnt == 0)
		{
			System.out.println(no +"  is not available as Element in Array.");
		}
	}
}