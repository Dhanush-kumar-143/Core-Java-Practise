public class staticBlock{
    public static void main(String[] args){
        // Object creation for Mobile class
        Mobile obj = new Mobile();
        obj.show();
    }
}

class Mobile{
    //instance variables
    String brand;
    int price;
    static String name;

    //Static block
    static
    {
        name= "Smart Device";
    }

    //Constructor to instalize the varaiables

    //default Constructor
    public Mobile()
    {
        brand = "Apple";
        price = 90000;
        // name = "Smartphone";
    }

    // parameterized constructor
    // public Mobile(String brand,int price,String name)
    // {
    //     this.brand=brand;
    //     this.price=price;
    //     this.name=name;
    // }

    //calling the method
    public void show()
    {
        System.out.println(brand + " : " + price + " : " + name);
    }
}