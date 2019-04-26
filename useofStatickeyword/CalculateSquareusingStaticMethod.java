//Aim : Write a program to calculate square of the number using static method

class calculate{
	static int ans;
	static void square(int no)
	{
		ans = no*no;
		System.out.println("Square of  is :" + ans);
	}
}

class CalculateSquareusingStaticMethod{
	
	public static void main(String[] args)
	{
		
		calculate.square(5);
		calculate.square(10);
		
		
	}
}
