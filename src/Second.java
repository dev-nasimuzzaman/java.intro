/*______________________________________________________________________________________________________________________
Author: [Md Nasimuzzaman]
Created On: [December 24, 2024]
GitHub: [https://github.com/dev-nasimuzzaman]

Description:
[The program defines a Second class, which creates an instance of the First class and calls two methods from it.]

Modification History:
Date           Author            Description
------------   ---------------   ---------------------------------------------------------------------------------------
[12/24/2024]   Md Nasimuzzaman   Initial version of the code.
[12/28/2024]   Md Nasimuzzaman   Added the modification history.
________________________________________________________________________________________________________________________
*/
public class Second {
    public static void main(String[] args){
        //object instance creation
        First myObj = new First();
        myObj.fullThrottle(); //calling a first class method
        myObj.speed(150); //calling speed method
        myObj.speed(300);
    }
}
