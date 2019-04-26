// Aim : Write a program to demostrate the usage of this keyword

class Student{
	long id;
	String Name;
	Student()
	{
		System.out.println("Hello from Default constructor.");
	}
	Student(int id,String Name)
	{
		this();
		this.id = id;
		this.Name=Name;
	}
	public void DisplayInfo()
	{
		System.out.println("Id :" + this.id);
		System.out.println("Id :" + this.Name);
	}
}

class StudentDemo1
{
	public static void main(String[] args)
	{
		Student s1 = new Student(1,"Kaushal");
		s1.DisplayInfo();
	}
}