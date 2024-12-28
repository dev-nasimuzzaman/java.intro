/*______________________________________________________________________________________________________________________
Author: [Md Nasimuzzaman]
Created On: [December 24, 2024]
GitHub: [https://github.com/dev-nasimuzzaman]

Description:
[This program demonstrates the implementation of a Java interface and how to define and use it in a class.]

Modification History:
Date           Author            Description
------------   ---------------   ---------------------------------------------------------------------------------------
[12/24/2024]   Md Nasimuzzaman   Initial version of the code.
[12/28/2024]   Md Nasimuzzaman   Added the modification history.
________________________________________________________________________________________________________________________
*/
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
