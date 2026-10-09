public class InheritanceDemoMain
{
    public static void main(String[] args)
    {
        //creating the object
        InheritanceDemoVeryAdvCalc  obj = new InheritanceDemoVeryAdvCalc();

        //calling the method
        int r1=obj.add(3,7);
        int r2=obj.sub(4,2);
        int r3=obj.multi(6,2);
        double r4=obj.div(45,2);
        double r5=obj.power(36,6);

        //printing the output
        System.out.println(r1 + " " +r2 + " " +r3+ " " +r4 + " " +r5);
    }
}

/*  Used classes

class InheritanceDemoCalc
{
    public int add(int n1,int n2)
    {
        return n1 + n2;
    }

    public int sub(int n1,int n2)
    {
        return n1-n2;
    }
}


public class InheritanceDemoAdvCalc extends InheritanceDemoCalc
{
    //methods
    public int multi(int n1, int n2)
    {
        return n1 * n2;
    }
    public int div(int n1, int n2)
    {
        return n1/n2;
    }
}

public class InheritanceDemoVeryAdvCalc extends InheritanceDemoAdvCalc
{
    public double power(int n1, int n2)
    {
        return n1 ^ n2;
    }
}

*/
