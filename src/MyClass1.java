/*______________________________________________________________________________________________________________________
Author: [Md Nasimuzzaman]
Created On: [December 24, 2024]
GitHub: [https://github.com/dev-nasimuzzaman]

Description:
[This program demonstrates inheritance and how access modifiers affect the ability to access methods and attributes in subclasses.]

Modification History:
Date           Author            Description
------------   ---------------   ---------------------------------------------------------------------------------------
[12/24/2024]   Md Nasimuzzaman   Initial version of the code.
[12/28/2024]   Md Nasimuzzaman   Added the modification history.
________________________________________________________________________________________________________________________
*/
public class MyClass1 extends MyClass{
    //accessing public method and attributes
    public static void main(String[] args){
        //creating an instance
        MyClass myObj = new MyClass();
        myObj.publicMethod();//accessing public method
        //myObj.privateMethod(); //can not access private method from different class

        MyClass1 myObj1 = new MyClass1();
        myObj1.protectedMethod();//derived access of protected method
    }
}

