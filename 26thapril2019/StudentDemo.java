// Aim : Write simple program that prints Student's information like student id and student name.
//Way1 : Main function within class

class StudentDemo{
	
	public static int sId; //For storing Student id
	public static String sName; //For storing Student Name
	
	public static void main(String[] args)
	{
		StudentDemo s1 = new StudentDemo();
		s1.sId = 1;
		s1.sName = "Kaushal Nayak";
		System.out.println("\nStudent Details are as below:\n");
		System.out.println("Student Id : "+ s1.sId);
		System.out.println("Student Name : "+ s1.sName);
	}
	
}