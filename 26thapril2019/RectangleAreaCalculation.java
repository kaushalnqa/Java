//Aim : Write a program to calculate the area of Rectangle.

class Rectangle{

 double length;
 double width;
 double rectArea;
 public void SetDetails(double l, double w)
 {
	 length = l;
	 width = w;
 }
 
 public void calcArea()
 {
	 rectArea = length*width;
 }
 
 public void ShowDetails()
 {
	 System.out.println("Length of Side is : "+ length);
	 System.out.println("Width of Side is : "+ width);
	 System.out.println("Area of Rectangle is : "+ rectArea);
 }
 
}

class RectangleAreaCalculation
{
	public static void main(String[] args)
	{
		Rectangle r = new Rectangle();
		r.SetDetails(15.4,20);
		r.calcArea();
		r.ShowDetails();
	}
}