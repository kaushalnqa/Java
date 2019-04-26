// Aim : Write simple program that prints Student's information like student id and student name.
//Way1 : Main function outside the class

class Student{
	
	public static int sId;
	public static String sName;
}

class StudentDemo1{
	
	public static void main(String[] args)
	{
		Student s = new Student();
		s.sId = 1;
		s.sName = "Vishal Prajapati";
		System.out.println("Id : "+ s.sId);
		System.out.println("Name : "+ s.sName);
	}
}