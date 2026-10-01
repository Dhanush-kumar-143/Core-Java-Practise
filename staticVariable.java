public class staticVariable{
    public static void main(String[] args){
        // creating object for Mobile class
        Mobile obj1 = new Mobile();
        obj1.brand="Apple";
        obj1.price=60000;
        Mobile.name= "SmartPhone";


        Mobile obj2 = new Mobile();
        obj2.brand="Samsung";
        obj2.price=50000;
        Mobile.name= "SmartMobile";

        Mobile.name= "SmartDevice";

        // calling methods
        obj1.show();
        obj2.show();
    }
}

class Mobile{
    //instance varibales
    String brand;
    int price;
    static String name;

    // creating instance method to call the objects
    public void show(){
        System.out.println(brand + " : " +price+ " : " +name );
    }
}