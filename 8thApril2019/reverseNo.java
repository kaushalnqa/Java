// Aim : Write a program to reverse the given no

class reverseNo{
	
	public static void main (String[] args)
	{
		int no = 143;
		int revno=0;
		while (no > 0)
		{
			revno = revno*10 + no%10;
			no = no /10;
		}
		System.out.println("Reverse no is : " + revno);
	}
}