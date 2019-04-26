//Aim : Write a Java program to assign value of instance variable for object1 to value of another object's instance variable without using constructor.

class test{
	int no;
	test(int a)
	{
		no = a;
	}
	test()
	{
		System.out.println("Hello Constructor without Parameterize.");
	}
	public void setDetail( int x)
	{
		 no = x;
	}
	public void showDetail()
	{
		System.out.println("no : "+ no);
	}
}

class CopyObjects
{
	public static void main(String[] args)
	{
		test t = new test(10);
		test t1 = new test();
		System.out.println("Display information of T Instance.");
		t.showDetail();
		System.out.println("Display information of T1 Instance.");
		t1.showDetail();
		t1.no = t.no;
		System.out.println("Display information of T1 Instance.");
		t1.showDetail();	
	}
}
