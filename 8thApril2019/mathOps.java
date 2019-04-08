/*
Aim : Write a program which supports below mentioned math ops
  a) addition of two no
  b) subtraction of two no
  c) multiplication of two no 
  d) division of no by another no
*/
class mathOps{
	
	public static void main (String[] args)
	{
		int no1 = 10;
		int no2 = 5;
		System.out.println("Math Operations:");
		System.out.println("Sum of " + no1 + " and " + no2 +" = " + (no1+no2));
		System.out.println("Subtraction of "+no1 +" and "+no2+" = "+(no1-no2));
		System.out.println("Multiplication of "+ no1 +" and "+ no2 +" = "+(no1*no2));
		System.out.println("Multiplication of "+ no1 +" and "+ no2 +" = "+(no1/no2));
	}
}