// Aim : Write simple program that prints Employee's information like employee id,employee name and Employee salary.
//Way1 : Initialize the variable using method

class EmployeeInfo{
	
	int empid;
	String empName;
	long salary;
	
	public void setDetails( int id, String Name, long sal)
	{
		empid = id;
		empName = Name;
		salary = sal;
	}
	public void showDetails()
	{
		System.out.println("\n" + empid +"\t\t" + empName + "\t\t" + salary);
		
	}
}

class EmployeeDemo
{
	public static void main(String[] args)
	{
		EmployeeInfo e1 = new EmployeeInfo();
		EmployeeInfo e2 = new EmployeeInfo();
		EmployeeInfo e3 = new EmployeeInfo();
		e1.setDetails(1,"Kaushal",55000);
		e2.setDetails(2,"Vishal",75000);
		e3.setDetails(3,"Dixit",85000);
		System.out.println("\nDetails of Employee is : ");
		System.out.println("\nEmployee id \tEmployee Name \tEmployee salary ");
		e1.showDetails();
		e2.showDetails();
		e3.showDetails();
	}
}