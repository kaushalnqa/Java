// Aim : Write simple program that prints Student's information like student id and student name.
//Way1 : Initialize the variable using method

class StudentInfo1{
	
	int sId;
	String sName;
	public void setInfo(int id,String name)
	{
		sId = id;
		sName = name;
	}
	public void displayInfo()
	{
		System.out.println("Name : "+ sName);
		System.out.println("id : "+ sId);
	}
}

class StudentDemo3{
	
	public static void main(String[] args)
	{
		StudentInfo1 si1 = new StudentInfo1();
		si1.setInfo(100,"Chintan");
		si1.displayInfo();
	}
}