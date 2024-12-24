class Lion{
    void makeSound(){
        System.out.println("Some Sound");
    }
}
class Tiger extends Lion{
    @Override
    void makeSound(){
        System.out.println("Roaaaaaaar");
    }
}
class Horse extends Lion{
    @Override
    void makeSound(){
        System.out.println("Hurrrrrrrrr");
    }
}
public class Polymorphism_overriding {
    public static void main(String[] args){
        //object instance creation
        Lion myObj = new Tiger();
        myObj.makeSound();

        Lion myObj1 = new Horse();
        myObj1.makeSound();
    }
}
