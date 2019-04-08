/*
AIM: Write a program to perform below mentioned string operation (Java,JavaScript)
   a) print string
   b) print length of string
   c) print string in upper case
   d) print string in lower case
   e) print character at specific index
   f) print reverse string 
   g) print substring 
   h) print index of any specific character

*/
class stringOps{
	
	public static void main (String[] args)
	{
		String str = "Hello World";
		String revstr="";
		System.out.println("String is " + str);
		System.out.println("Length of string is " + str.length());
		System.out.println("String in Upper case is " + str.toUpperCase());
		System.out.println("String in Lower case is " + str.toLowerCase());
		System.out.println("Character at 5th index is " + str.charAt(7));
		System.out.println("Substring of string between 1st and 8th character is " + str.substring(0,7));
		System.out.println("Index value of first occurance of o character "+ str.indexOf("o"));
		for (int i=str.length()-1;i>=0;i--)
		{
			revstr = revstr + str.charAt(i); 
		}
		System.out.println("Reverse String is "+ revstr);
	}
}