// creating a class named car
class Car{
    
    // instance variables
    // each object will have it's own brand and price
    String brand;
    int price;

    // static varibale
    // shared by all objects of the class
    static String name;

    // non static method
    // can directly access both instance and static variables
    public void show(){
        System.out.println(brand + ":" + price + ":" + name);
    }

    // static method
    // static method cannot directly access non-static varibales
    // so we pass an object as parameter
    public static void show1(Car obj){
        
        // accessing instance variables using object reference
        // accessing static variable directly
        System.out.println(obj.brand + ":" + obj.price + ":" + name);
    }
}

public class StaticMethod {
    public static void main(String a[]){

        // creating first object of Car class
        Car obj1=new Car();
        obj1.brand="BMW";
        obj1.price= 1200000;

        //assigning value to static variables..they belong to class,not object
        Car.name="car";
        
        // creating second object
        Car obj2=new Car();
        obj2.brand="Audi";
        obj2.price=1500000;

        // again assigning value to static variables..they belong to class,not object
        Car.name="car";
        
        // calling non static method using class objects       
        obj1.show();
        obj2.show();

        // calling static method using class name
        // passing obj1 because static method cannot directly access instance variables
        Car.show1(obj1);
    }
}
