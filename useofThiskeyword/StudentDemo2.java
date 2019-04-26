// Aim : Write a program to demostrate the usage of this keyword

class Student1{
	long id;
	String Name;
	Student1(int id)
	{
		System.out.println("\nFrom one parameterized Constructor.\n");
		this.id = id;
	}
	Student1(int id,String Name)
	{
		this(id);
		System.out.println("\nFrom Two parameterized Constructor.\n");
		this.Name=Name;
	}
	public void DisplayInfo()
	{
		System.out.println("Id :" + this.id);
		System.out.println("Id :" + this.Name);
	}
}

class StudentDemo2
{
	public static void main(String[] args)
	{
		Student1 s1 = new Student1(1,"Kaushal");
		s1.DisplayInfo();
	}
}