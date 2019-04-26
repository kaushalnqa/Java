//Aim : Write a Java program to demostrate copy constructor functionality to initialize object using value of another object

class pConstructor1{
	
	int no;
	String Name;
	
	pConstructor1(int i, String a)
	{
		no = i;
		Name = a;
	}
	
	pConstructor1( pConstructor1 p)
	{
		this.no = p.no;
		this.Name = p.Name;
	}
	
	pConstructor1()
	{
		System.out.println("Constructor with No Arguement called. Instance created.");
	}
	public void displayNo()
	{
		System.out.println("No :" + this.no);
	}
	public void displayName()
	{
		System.out.println("Name:"+ this.Name);
	}
	
	public void DisplayInfo()
	{
		this.displayNo();
		this.displayName();
	}
	public void setInfo(int no, String n)
	{
		this.no = no;
		Name = n;
	}

}

class thiskeywordforCallingFunction{
	
	public static void main(String[] args)
	{
		pConstructor1 cc = new pConstructor1();
		System.out.println("\nValues of instance varibales for Instance CC : \n");
		cc.DisplayInfo();
		cc.setInfo(1,"Kaushal");
		pConstructor1 c1 = new pConstructor1(20,"Dixit");
		System.out.println("\nValues of instance varibales for Instance CC : \n");
		cc.DisplayInfo();
		System.out.println("\nValues of instance varibales for Instance C1 : \n");
		c1.DisplayInfo();
	
	}
	
}