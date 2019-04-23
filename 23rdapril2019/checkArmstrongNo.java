// Aim : Write a program to find no is armstrong number or not

import java.lang.Math;

class checkArmstrongNo{
	
	public static void main(String[] args)
	{
		int no;
		no = 153;
		validateNoForArmstrong(no);
		no = 25;
		validateNoForArmstrong(no);
	}
	
	public static void validateNoForArmstrong(int no)
	{
		int tno=0;
		int rem=0;
		int dup = no;
		while (dup>0)
		{
			rem = dup%10;
			dup = dup/10;
			tno = tno + (int) Math.pow(rem,3);
		}
		//System.out.println(tno);
		if ( tno == no )
		{
			System.out.println(no + " is Armstrong No.");
		}
		else
		{
			System.out.println(no + " is not Armstrong No.");
		}
	}
}