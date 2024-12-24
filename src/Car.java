import javax.swing.plaf.synth.SynthSpinnerUI;

public class Car {
    int x =5, y = 10, age = 30;
    String name = "Toyota", model = "2024", fname = "Ford", lname = "Mustang";

    //creating a class method
    static void myMethod(int age, String name){
        System.out.println("Hi there!");
    }
    public static void main(String[] args){
        myMethod(20 , "nasim"); //passing data argumments
        //creating an object
        Car myCarobj1 = new Car();
        System.out.println("Car Name: " + myCarobj1.fname + " " + myCarobj1.lname + " | " +"Model: " +myCarobj1.model+" | " + "Consumers Age: " + myCarobj1.age + " | " + "Quantity: " + myCarobj1.x + " | " + "Quality Rating: " + myCarobj1.y + "/10");
    }
}
