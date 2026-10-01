public class EncapsulationBasic1 {
    public static void main(String[] args){
        test t= new test();
        //setting the values for instance variables through set method
        t.setAge(23);
        t.setname("Dhanush Kumar");

        // calling the instance varaible through methods
        t.getAge();
        t.getname();
        System.out.println(t.getname() + ":" + t.getAge());
    }
}

class test{
    // instance or global variables
    private int Age;
    private String name;

    //method for calling out variables
    public int getAge(){
        return Age;
    }

    public void setAge(int a){
        Age = a;
    }

    public String getname(){
        return name;
    }

    public void setname(String n){
        name = n;
    }
}
