// Aim : Write a java program to remove all the white spaces from a string

class removeWhiteSpace{
	
	public static void main(String[] args)
	{
		String str = "\n Hello world. \n\t This is my string";
		System.out.println("\n Before Removing White Space, String is : "+str);
		str = removeWhiteSpaces(str);
		System.out.println("\n After Removing White Space, String is : "+str);
	}
	public static String removeWhiteSpaces(String a)
	{
		a=a.replaceAll("\n"," ");
		a=a.replaceAll("\t","");
		a=a.replaceAll("\f","");
		a=a.replaceAll("\r","");
		a=a.replaceAll(" ","");
		return a;
	}
	
}