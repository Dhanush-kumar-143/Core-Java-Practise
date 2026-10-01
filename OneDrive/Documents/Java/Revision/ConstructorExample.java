public class ConstructorExample{
    public static void main(String[] args){
        //creating object
        Human obj = new Human();
        Human obj1 =  new Human(13359,"District Collector");
        System.out.println(obj.getName() + " : " + obj.getAge());
        System.out.println(obj1.getName() + " : " + obj1.getAge());
    }
}

class Human{
    // instance variables
    private int humanage;
    private String humanname;

    //  Creating a Constructor
    public Human(){ //Default Constructor
        // assinging values
        humanage = 60;
        humanname = "subbaratnama";
    }

    public Human(int h, String n){
        humanage = h;
        humanname = n;
    }

    // setters methods
    // public void setAge(int age){
    //     this.humanage= age;
    // }

    // public void setAge(String name){
    //     this.humanname= name;
    // }

    // getters methods
    public int getAge(){
        return humanage;
    }

    public String getName(){
        return humanname;
    }
}