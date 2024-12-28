/*______________________________________________________________________________________________________________________
Author: [Md Nasimuzzaman]
Created On: [December 24, 2024]
GitHub: [https://github.com/dev-nasimuzzaman]

Description:
[This program demonstrates Hybrid Inheritance in Java, where a class combines inheritance from both a superclass and an interface.
Hybrid inheritance is a combination of 2 or more types of inheritance]

Modification History:
Date           Author            Description
------------   ---------------   ---------------------------------------------------------------------------------------
[12/24/2024]   Md Nasimuzzaman   Initial version of the code.
[12/28/2024]   Md Nasimuzzaman   Added the modification history.
________________________________________________________________________________________________________________________
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
