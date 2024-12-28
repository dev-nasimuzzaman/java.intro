/*______________________________________________________________________________________________________________________
Author: [Md Nasimuzzaman]
Created On: [December 24, 2024]
GitHub: [https://github.com/dev-nasimuzzaman]

Description:
[This program demonstrates the use of static methods in Java.]

Modification History:
Date           Author            Description
------------   ---------------   ---------------------------------------------------------------------------------------
[12/24/2024]   Md Nasimuzzaman   Initial version of the code.
[12/28/2024]   Md Nasimuzzaman   Added the modification history.
________________________________________________________________________________________________________________________
*/
public class Math {
    //static method multiplication
    public static int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        //calling a static methods directly we can access using class name
        int result = Math.multiply(3, 6);
        System.out.println(result);
    }
}
