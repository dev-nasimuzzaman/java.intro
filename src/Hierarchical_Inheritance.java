/*______________________________________________________________________________________________________________________
Author: [Md Nasimuzzaman]
Created On: [December 24, 2024]
GitHub: [https://github.com/dev-nasimuzzaman]

Description:
[This program demonstrates Hierarchical Inheritance in Java, where multiple subclasses inherit from a single superclass.]

Modification History:
Date           Author            Description
------------   ---------------   ---------------------------------------------------------------------------------------
[12/24/2024]   Md Nasimuzzaman   Initial version of the code.
[12/28/2024]   Md Nasimuzzaman   Added the modification history.
________________________________________________________________________________________________________________________
*/
//superclass
class Shape{
    //method 1
    void draw(){
        System.out.println("Drawing a shape");
    }
}
//subclass 1
class Circle extends Shape{
    //method
    void drawCircle(){
        System.out.println("Drawing a Circle");
    }
}
//subclass 2
class Square extends Shape{
    //method
    void drawSquare(){
        System.out.println("Drawing a square");
    }
}
public class Hierarchical_Inheritance {
    /*What is Hierarchical Inheritance?
    multiple classes extends from a superclass
     */
    public static void main(String[] args){
        //creating an object
        Square myObj = new Square();
        myObj.drawSquare(); //child class own this method
        myObj.draw(); // inherited from superclass
    }
}
