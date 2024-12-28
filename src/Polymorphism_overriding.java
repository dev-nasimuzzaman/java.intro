/*______________________________________________________________________________________________________________________
Author: [Md Nasimuzzaman]
Created On: [December 24, 2024]
GitHub: [https://github.com/dev-nasimuzzaman]

Description:
[This program demonstrates Polymorphism through Method Overriding in Java.]

Modification History:
Date           Author            Description
------------   ---------------   ---------------------------------------------------------------------------------------
[12/24/2024]   Md Nasimuzzaman   Initial version of the code.
[12/28/2024]   Md Nasimuzzaman   Added the modification history.
________________________________________________________________________________________________________________________
*/
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
