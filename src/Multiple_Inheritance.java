/*______________________________________________________________________________________________________________________
Author: [Md Nasimuzzaman]
Created On: [December 24, 2024]
GitHub: [https://github.com/dev-nasimuzzaman]

Description:
[This code demonstrates multiple inheritance in Java through interfaces, where a single class implements two interfaces. In this case, the class Nasim implements both the Walkable and Swimmable interfaces.]

Modification History:
Date           Author            Description
------------   ---------------   ---------------------------------------------------------------------------------------
[12/24/2024]   Md Nasimuzzaman   Initial version of the code.
[12/28/2024]   Md Nasimuzzaman   Added the modification history.
________________________________________________________________________________________________________________________
*/
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
