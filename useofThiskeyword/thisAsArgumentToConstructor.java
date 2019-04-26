// Aim : Write a program which demostrates use of this keyword as arguement to constructor

class Test1{

	thisAsArgumentToConstructor ta;
	Test1(thisAsArgumentToConstructor temp)
	{
	 this.ta = temp;
	}
	
	public void Display()
	{
		System.out.println("Display function of Test1 class.");
		System.out.println(ta.Name);
	}

}

class thisAsArgumentToConstructor
{
	String Name="Kaushal";
	thisAsArgumentToConstructor()
	{
		Test1 t = new Test1(this);
		t.Display();
	}
	public static void main(String[] args){
		thisAsArgumentToConstructor tAATC = new thisAsArgumentToConstructor();
	}
}