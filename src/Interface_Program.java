interface Shape2{
    //abstract methods
    double area();
    void display();
}
//Implementation the Shape2 interface in this class
class Circle2 implements Shape2{
    double radius;
    //Class Constructor creation
    public Circle2(double radius){
        this.radius = radius;
    }
    @Override
    public double area(){
        return radius * radius;
    }
    @Override
    public void display(){
        System.out.println("This is a circle");
    }
}
public class Interface_Program {
    //creating an instance
    public static void main(String[] args){
        Circle2 circle = new Circle2(7);
        System.out.println("Area of circle :" + circle.area());
        circle.display();
    }

}
