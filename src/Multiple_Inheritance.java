//interface_1
interface Walkable{
    void walk();
}
//interface_2
interface Swimmable{
    void swim();
}
//class implementation using both interfaces
class Nasim implements Walkable, Swimmable{
    @Override
    public void swim() {
        System.out.println("Nasim is swimming");
    }
    @Override
    public void walk() {
        System.out.println("Nasim is walking");
    }
}
public class Multiple_Inheritance {
    public static void main(String[] args){
        Nasim obj = new Nasim();
        obj.swim();
        obj.walk();
    }
}
