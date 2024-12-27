/*______________________________________________________________________________________________________________________
Author: [Md Nasimuzzaman]
Created On: [December 27, 2024]
GitHub: [https://github.com/dev-nasimuzzaman]

Description:
[---------------------------]

Modification History:
Date           Author            Description
------------   ---------------   ---------------------------------------------------------------------------------------
[12/27/2024]   Md Nasimuzzaman   Initial version of the code.
________________________________________________________________________________________________________________________
*/
import com.example.car.*;
public class MainApp {
    public static void main(String[] args){
        //creating a local instance or object
        car mycar = new car("Tesla", "2024");
        Engine myEngine = new Engine(1500);

        //using this objects to call the car and engine methods
        mycar.displayinfo();
        myEngine.start();
    }
}
