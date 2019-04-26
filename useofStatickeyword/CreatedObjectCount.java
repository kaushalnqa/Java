// Aim : Write a program to print total count of created Object

class Cobject{
	
	static int count;
	Cobject()
	{
		count++;
		System.out.println(count + "'s Object created");
	}
	public void showCount()
	{
		System.out.println("Total no of Created Object : " + count);
	}
}

class CreatedObjectCount{
	
	public static void main(String[] args)
	{
		Cobject c1 = new Cobject();
		Cobject c2 = new Cobject();
		Cobject c3 = new Cobject();
		c1.showCount();
	}
	
}