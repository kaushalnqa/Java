//Aim : Write a Java program to create parameterized constructor and initialize instance variable

class paraConstructor{
	
	int value;
	
	paraConstructor(int a)
	{
		value = a;
	}
	
	public void setValue(int a)
	{
		value=a;
	}
	public void displayValue()
	{
		System.out.println("Value :" + value);
	}
	
	public static void main(String args[])
	{
		paraConstructor pc = new paraConstructor(100);
		paraConstructor p = new paraConstructor(10);
		System.out.println("\nBefore setting value is : \n");
		p.displayValue();
		pc.displayValue();
		System.out.println("\nSetting value.");
		pc.setValue(111);
		p.setValue(3);
		System.out.println("\nAfter setting value is : \n");
		p.displayValue();
		pc.displayValue();
	}
}

