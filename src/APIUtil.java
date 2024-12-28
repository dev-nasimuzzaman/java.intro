/*______________________________________________________________________________________________________________________
Author: [Md Nasimuzzaman]
Created On: [December 27, 2024]
GitHub: [https://github.com/dev-nasimuzzaman]

Description:
[This program demonstrates the usage of the java.util package, specifically ArrayList and List. It creates an ArrayList of type String, adds four names to the list, and prints the list of names.
The code shows how to add elements to a dynamic array and display the list content in Java.]

Modification History:
Date           Author            Description
------------   ---------------   ---------------------------------------------------------------------------------------
[12/27/2024]   Md Nasimuzzaman   Initial version of the code.
________________________________________________________________________________________________________________________
*/
import java.util.ArrayList;
import java.util.List;
public class APIUtil {
    public static void main(String[] args){
        //java.util packages
        List<String> names = new ArrayList<>();
        names.add("Nasimuzzaman");
        names.add("Sayema Akter");
        names.add("Ibrahim Hossain");
        names.add("Habibullah");

        System.out.println("Names added are :" + names);
    }
}
