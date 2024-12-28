/*______________________________________________________________________________________________________________________
Author: [Md Nasimuzzaman]
Created On: [December 24, 2024]
GitHub: [https://github.com/dev-nasimuzzaman]

Description:
[This program defines a simple class Person with a constructor and a method to display the person's information.]

Modification History:
Date           Author            Description
------------   ---------------   ---------------------------------------------------------------------------------------
[12/24/2024]   Md Nasimuzzaman   Initial version of the code.
[12/28/2024]   Md Nasimuzzaman   Added the modification history.
________________________________________________________________________________________________________________________
*/
public class Person {
    String name;
    int age;
    //default constructor
    public Person(String n, int a){
        name = n;
        age = a;
    }
    void show(){
        System.out.println("Name: " + name + " "+ "Age: "+ age);

    }
    public static void main(String[] args){
        //creating class instance
        Person myObj = new Person("Nasim", 20);
        myObj.show();
        Person myObj1 = new Person("Samu", 20);
        myObj1.show();
    }
}
