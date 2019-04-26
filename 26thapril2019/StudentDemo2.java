// Aim : Write simple program that prints Student's information like student id and student name.
//Way1 : Initialize the variable using reference variable

class StudentInfo{
	
	int studentId;
	String studentName;
}

class StudentDemo2{
	
	public static void main(String[] args)
	{
		StudentInfo s1 = new StudentInfo();
		StudentInfo s2 = new StudentInfo();
		s1.studentId = 100;
		s1.studentName = "Chintan Gajjar";
		s2.studentId = 108;
		s2.studentName = "Dixit Nagar";
		System.out.println("\n Student Details are : \n");
		System.out.println("Student id : "+ s1.studentId);
		System.out.println("Student Name : "+ s1.studentName);
		System.out.println("Student id : "+ s2.studentId);
		System.out.println("Student Name : "+ s2.studentName);
	}
}
