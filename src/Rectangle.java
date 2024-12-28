/*______________________________________________________________________________________________________________________
Author: [Md Nasimuzzaman]
Created On: [December 24, 2024]
GitHub: [https://github.com/dev-nasimuzzaman]

Description:
[This program defines a Rectangle class with methods to calculate the area and perimeter.]

Modification History:
Date           Author            Description
------------   ---------------   ---------------------------------------------------------------------------------------
[12/24/2024]   Md Nasimuzzaman   Initial version of the code.
[12/28/2024]   Md Nasimuzzaman   Added the modification history.
________________________________________________________________________________________________________________________
*/
public class Rectangle {
    //public method
    public int calculateArea(int length, int width){
        return length * width;
    }
    public int calculateParameter(int length, int width){
        return 2 * (length * width);
    }
    public static void main(String[] args){
        //creating an instance or object creation
        Rectangle myObj = new Rectangle();
        //calling a method
        int result = myObj.calculateArea(4,6);
        int parameter = myObj.calculateParameter(8,4);
        System.out.println("Area: "+result +" " + "Parameter: " + parameter);
    }
}
