//Aim : Write a Java program to create default constructor and call it

class constructor{

 constructor()
 {
	 System.out.println("Hello From Constructor");
 }
 public void Message()
 {
	 System.out.println("Hello This is message from Instance Method.");
 }
 
 public static void main(String[] args)
 {
	 constructor c = new constructor();
	 c.Message();
 }
}