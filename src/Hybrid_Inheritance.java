/*
   Hybrid inheritance is a combination of 2 or more types
   of inheritance
    */
interface Flyer{
    void fly();
}
class Bird{
   void chirp(){
       System.out.println("Birds are chirping");
   }
}
class Sparrow extends Bird implements Flyer{
    @Override
    public void fly(){
        System.out.println("Sparrow is flying");
    }
}
public class Hybrid_Inheritance {
    public static void main(String[] args){
        //creating a local object or instance
        Sparrow myObj = new Sparrow();
        myObj.fly(); //interface and child class method
        myObj.chirp(); //inherited superclass method
    }
}
