//Aim : Write a Java program to demostrate parameterized constructor overloading and initialize instance variable

class Constructor{
	
	int id;
	String Name;
	double salary;
	Constructor(int a, String b)
	{
		id = a;
		Name =b;
	}
	
	Constructor(int a,String b,double d)
	{
		id = a;
		Name = b;
		salary = d;
	}
	
	public void UpdateSalary(double d)
	{
		salary = d;
	}
	
	public void DisplayInfo()
	{
		System.out.println("\nName: "+ Name);
		System.out.println("\nid: "+ id);
		System.out.println("\nSalary: "+ salary);
	}
}


class ConstructorOverloading{
	
	public static void main(String[] args)
	{
		Constructor cr = new Constructor(10,"Kaushal");
		System.out.println("\nvalue of Instance variable for Object CR is as below :\n");
		cr.DisplayInfo();
		cr.UpdateSalary(54000.35);
		Constructor c = new Constructor(20,"Dixit",143000.10);
		System.out.println("\nvalue of Instance variable for Object C is as below :\n");
		c.DisplayInfo();
		System.out.println("\nvalue of Instance variable for Object CR is as below :\n");
		cr.DisplayInfo();
		
	}
}