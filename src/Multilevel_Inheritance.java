/*______________________________________________________________________________________________________________________
Author: [Md Nasimuzzaman]
Created On: [December 24, 2024]
GitHub: [https://github.com/dev-nasimuzzaman]

Description:
[This code demonstrates multilevel inheritance in Java, where a class inherits from a child class, and that child class inherits from a parent class. In this case,
the Dogo class is a descendant of the Mamal class, which itself is a descendant of the Animal1 class.]

Modification History:
Date           Author            Description
------------   ---------------   ---------------------------------------------------------------------------------------
[12/24/2024]   Md Nasimuzzaman   Initial version of the code.
[12/28/2024]   Md Nasimuzzaman   Added the modification history.
________________________________________________________________________________________________________________________
*/

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
