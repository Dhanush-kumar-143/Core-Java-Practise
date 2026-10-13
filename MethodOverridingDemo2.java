public class MethodOverridingDemo2 
{
    public static void main(String[] args)
    {
        baseClass obj = new baseClass();
        int r1= obj.add(5,6);
        System.out.println(r1);
    }
}

class superClass
{
    // static method
    public int add(int n1,int n2)
    {
        return n1+n2;
    }
}

class baseClass extends superClass
{
    public int add(int n1, int n2)
    {
        return n1+n2+1;
    }
}

/* output : 
12
 */