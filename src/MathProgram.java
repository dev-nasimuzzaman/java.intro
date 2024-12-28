/*______________________________________________________________________________________________________________________
Author: [Md Nasimuzzaman]
Created On: [December 24, 2024]
GitHub: [https://github.com/dev-nasimuzzaman]

Description:
[This program demonstrates the implementation and use of a static method in Java to perform a simple addition operation. ]

Modification History:
Date           Author            Description
------------   ---------------   ---------------------------------------------------------------------------------------
[12/24/2024]   Md Nasimuzzaman   Initial version of the code.
[12/28/2024]   Md Nasimuzzaman   Added the modification history.
________________________________________________________________________________________________________________________
*/
public class  MathProgram {
    //creating method
    static int add(int a, int b){
        return a + b;
    }
    public static void main (String[] args){
        //calling a method
       int sum = add(5,6);
       System.out.println("Total: "+sum);
    }
}
