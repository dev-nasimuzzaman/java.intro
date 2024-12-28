/*______________________________________________________________________________________________________________________
Author: [Md Nasimuzzaman]
Created On: [December 24, 2024]
GitHub: [https://github.com/dev-nasimuzzaman]

Description:
[This program demonstrates the concept of Polymorphism using interfaces in Java. Specifically, it shows how the same method can have different implementations based on the type of object invoking it.]

Modification History:
Date           Author            Description
------------   ---------------   ---------------------------------------------------------------------------------------
[12/24/2024]   Md Nasimuzzaman   Initial version of the code.
[12/28/2024]   Md Nasimuzzaman   Added the modification history.
________________________________________________________________________________________________________________________
*/
interface Sports{
    void play();
}
class Cricket implements Sports{
    @Override
    public void play(){
        System.out.println("Playing cricket");
    }
}
class Football implements Sports{
    @Override
    public void play(){
        System.out.println("Playing Football");
    }
}
public class Polymorphism_Interface {
    public static void main(String[] args){
        //instance Creation
        Cricket obj = new Cricket();
        obj.play();

        Football obj1 = new Football();
        obj1.play();
    }
}
