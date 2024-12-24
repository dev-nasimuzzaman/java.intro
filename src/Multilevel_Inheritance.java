//super class/parent class
class Animal1{
    void eat(){
        System.out.println("Eats food");
    }
}
//second class/child class
class Mamal extends Animal1{
    void givebirth(){
        System.out.println("Mammal gives birth");
    }
}
// third class/child class
class Dogo extends Mamal{
    void bark(){
        System.out.println("Dog is barking");
    }
}
public class Multilevel_Inheritance {
    public static void main(String[] args){
        Dogo myObj = new Dogo();
        myObj.bark();//own method
        myObj.eat();//super class inherited method
        myObj.givebirth();//inherited method from previous class
    }
}
