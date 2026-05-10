class Mobile{  // a class in java means template of the code 
    
    String brand;
    int amount;
    static String name;  //static is used here which means it can be shared by all objects

    public void show(){ //method/ function inside the class..this can be used by every Mobile object
        System.out.println(brand + ":"+ amount + ":" + name);
    }
}    
public class StaticVariable { // here comes the second class
    public static void main(String a[]){  // main method
        Mobile obj1=new Mobile(); //creating object
        obj1.amount=1500;
        obj1.brand="apple";
        Mobile.name= "smartphone";  // here obj1.(object name) is not used instead used Mobile(class name) because it's a static variable here in java which is common to use by everyone

        Mobile obj2=new Mobile(); // creatinng second object
        obj2.amount=1700;
        obj2. brand="samsung";
        Mobile.name="smartphone";
        
        // method calling
        obj1.show();
        obj2.show();
    }
}
