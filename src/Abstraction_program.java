/*______________________________________________________________________________________________________________________
Author: [Md Nasimuzzaman]
Created On: [December 26, 2024]
GitHub: [https://github.com/dev-nasimuzzaman]

Description:
[This program demonstrates object creation and accessing an attribute from another class. It defines a Vehicle class with a main method that creates an instance
of the Car class and prints the name attribute of the Car object. The Car class should contain the name attribute to avoid errors.]

Modification History:
Date           Author            Description
------------   ---------------   ---------------------------------------------------------------------------------------
[12/26/2024]   Md Nasimuzzaman   Initial version of the code.
[12/28/2024]   Md Nasimuzzaman   Added the modification history.
________________________________________________________________________________________________________________________
*/
//Abstraction class
abstract class Shape1{
    //abstract method(no implementation)
    public abstract void draw();
    //concrete method
    public void displayArea(){
        System.out.println("Area :" + calculateArea());
    }
    //abstract method
    protected abstract double calculateArea();
}
// concrete subclasses
class Circle1 extends Shape1{
    private double radius;

    public Circle1(double radius){
        this.radius = radius;

    }
    @Override
    public void draw(){
        System.out.println("Drawing a circle");
    }
    @Override
    protected double calculateArea(){
        return radius * radius;
    }
}
//subclass implementation
class Rectangle1 extends Shape1{
    private double length;
    private double width;

    public Rectangle1(double length, double width){
        this.length = length;
        this.width = width;
    }
    @Override
    public void draw(){
        System.out.println("Drawing a Rectangle");
    }
    @Override
    protected double calculateArea(){
        return length * width;
    }
}
public class Abstraction_program {
    public static void main(String[] args){
        //creating and instance/object
        Circle1 circle = new Circle1(4);
        Rectangle1 rectangle = new Rectangle1(5,7);

        //using abstract class reference
        Shape1 shape1 = circle;
        Shape1 shape2 = rectangle;

        //calling an abstact method
        shape1.draw();
        shape1.displayArea();

        shape2.draw();
        shape2.displayArea();
    }
}
