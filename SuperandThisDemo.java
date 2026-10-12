public class SuperandThisDemo {
    public static void main(String[] args)
    {
        // Creating a object for Default Constructor B
        //B obj= new B();

        // Creating a object for parameterized Constructor B
        B obj = new B(6);
    }
}

class A
{
    // Default Constructor
    public A()
    {
        super();
        System.out.println("this Is Default constructor of A");
    }

    // Parameterized Constructor -- A constructor which takes value
    public A(int n)
    {
        super();
        System.out.println("This is Parameterized Constructor of A");
    }
}

class B extends A
{
    // Default Constructor
    public B()
    {
        super();
        System.out.println("this is Default Constructor of B");
    }

    // Parameterized Constructor -- A constructor which takes value
    public B(int n)
    {
        // super(n);
        this();
        System.out.println("This is Parameterized Constructor of B");
    }
}

/*  Note : 
* By default every Constructor will call first super method
* Super is nothing but calling the super or parent class
 */