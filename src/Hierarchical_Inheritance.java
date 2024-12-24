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
