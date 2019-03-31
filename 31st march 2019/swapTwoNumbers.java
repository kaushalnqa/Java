class swapTwoNumbers {

	public static void main (String[] args)
	{
		int no1 = 10;
		int no2 = 20;
		swapTwoNumbers(10,20);
	}
	
	
	public static void swapTwoNumbers(int a, int b)
	{
		System.out.println(" Value of variables before swapping is as below : ");
		System.out.println("========================");
		System.out.println(" value of no1 is " + a);
		System.out.println(" value of no2 is " + b);
		System.out.println("========================");
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("========================");
		System.out.println(" Value of variables after swapping is as below : ");
		System.out.println("========================");
		System.out.println(" value of no1 is " + a);
		System.out.println(" value of no2 is " + b);
	}
}