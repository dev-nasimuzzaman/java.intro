/*______________________________________________________________________________________________________________________
Author: [Md Nasimuzzaman]
Created On: [December 24, 2024]
GitHub: [https://github.com/dev-nasimuzzaman]

Description:
[This code demonstrates the use of access modifiers in Java. Access modifiers determine the visibility or accessibility of classes, methods, and variables.]

Modification History:
Date           Author            Description
------------   ---------------   ---------------------------------------------------------------------------------------
[12/24/2024]   Md Nasimuzzaman   Initial version of the code.
[12/28/2024]   Md Nasimuzzaman   Added the modification history.
________________________________________________________________________________________________________________________
*/
public class MyClass {
    //public attribute
    public int publicVariable;
    //private attribute
    private int privateVariable;
    //protected attribute
    protected int protectedVariable;
    //default package-private
    int packageprivateVariable;

    //public method
    public void publicMethod(){
        System.out.println("This is a public method");
    }
    //private method
    private void privateMethod(){
        System.out.println("This is a private method");
    }
    //protected method
    protected void protectedMethod(){
        System.out.println("This is a protected method");
    }
    //default package-private method
    void packagePrivateMethod(){
        System.out.println("This is private-package default method");

    }


    public static void main(String[] args){
        //object creation
        MyClass myObj = new MyClass();
        myObj.privateMethod();//private method accessible inside the class only
        myObj.protectedMethod();//self class accessible protected method
        myObj.packagePrivateMethod();
    }

}
