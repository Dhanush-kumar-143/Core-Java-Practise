public class AnonymusObjectSample
{
	public static void main(String[] args)
	{
	new A().show(); // this type of objects are defined as Anonymus Object
		
	}
}

class A
{
	//Constructor
	public A()
	{
		System.out.println("Object created");
	}
	
	//method
	public void show()
	{
		System.out.println("I am in Show method");
	}
	
}