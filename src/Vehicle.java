/*______________________________________________________________________________________________________________________
Author: [Md Nasimuzzaman]
Created On: [December 24, 2024]
GitHub: [https://github.com/dev-nasimuzzaman]

Description:
[This program demonstrates object creation and accessing an attribute from another class. It defines a Vehicle class with a main method that creates an instance
of the Car class and prints the name attribute of the Car object. The Car class should contain the name attribute to avoid errors.]

Modification History:
Date           Author            Description
------------   ---------------   ---------------------------------------------------------------------------------------
[12/24/2024]   Md Nasimuzzaman   Initial version of the code.
[12/28/2024]   Md Nasimuzzaman   Added the modification history.
________________________________________________________________________________________________________________________
*/
public class Vehicle {
    public static void main(String[] args){
        //creating car class object instance
        Car myObj = new Car();
        System.out.println(myObj.name);
    }
}
