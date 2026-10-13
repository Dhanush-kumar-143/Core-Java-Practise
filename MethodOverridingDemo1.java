public class MethodOverridingDemo1
{
    public static void main(String[] args)
    {
        // object creation
        B obj = new B();
        obj.show();
        obj.config();
    }
}

class A
{
    // non static method
    public void show()
    {
        System.out.println("in A Show");
    }
    public void config()
    {
        System.out.println("in Config file");
    }
}

class B extends A
{
    public void show()
    {
        System.out.println("in B show");
    }
}

/* output : Overrides the show method in class A, by calling method in class B

in B show
in Config file
*/
