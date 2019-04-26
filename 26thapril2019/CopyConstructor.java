//Aim : Write a Java program to demostrate copy constructor functionality to initialize object using value of another object

class pConstructor{
	
	int no;
	String Name;
	
	pConstructor(int i, String a)
	{
		no = i;
		Name = a;
	}
	
	pConstructor( pConstructor p)
	{
		no= p.no;
		Name = p.Name;
	}
	
	pConstructor()
	{
		System.out.println("Constructor with No Arguement called. Instance created.");
	}
	
	public void DisplayInfo()
	{
		System.out.println("No :" + no);
		System.out.println("Name:"+ Name);
	}
	public void setInfo(int no1, String n)
	{
		no = no1;
		Name = n;
	}

}

class CopyConstructor{
	
	public static void main(String[] args)
	{
		pConstructor cc = new pConstructor();
		cc.setInfo(1,"Kaushal");
		pConstructor c1 = new pConstructor(20,"Dixit");
		pConstructor c2 = new pConstructor(cc);
		System.out.println("\nValues of instance varibales for Instance CC : \n");
		cc.DisplayInfo();
		System.out.println("\nValues of instance varibales for Instance C1 : \n");
		c1.DisplayInfo();
		System.out.println("\nValues of instance varibales for Instance C2 : \n");
		c2.DisplayInfo();
	}
	
}