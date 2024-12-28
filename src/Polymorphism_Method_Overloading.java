/*______________________________________________________________________________________________________________________
Author: [Md Nasimuzzaman]
Created On: [December 24, 2024]
GitHub: [https://github.com/dev-nasimuzzaman]

Description:
[The program demonstrates Method Overloading in Java, which is a type of Polymorphism where multiple methods in the same class have the same name but differ in the number or type of their parameters.]

Modification History:
Date           Author            Description
------------   ---------------   ---------------------------------------------------------------------------------------
[12/24/2024]   Md Nasimuzzaman   Initial version of the code.
[12/28/2024]   Md Nasimuzzaman   Added the modification history.
________________________________________________________________________________________________________________________
*/
public class Polymorphism_Method_Overloading {
    //method with 2 parameters
    static int add(int a, int b){
        return a + b;
    }
    //method with 3 parameters
    static int add(int a, int b, int c){
        return a + b + c;
    }
    //method with 2 double data type parameter
    static double add(double a, double b){
        return a + b;
    }
    static String add(String a, String b){
        return a + b;
    }
    public static void main(String[] args){
        //calling overloaded methods
        int sum1 = add(5, 8);
        int sum2 = add(2,3,7);
        double sum3 = add(3.2, 5.6);

        // display the result
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
    }
}
