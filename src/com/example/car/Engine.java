/*______________________________________________________________________________________________________________________
Author: [Md Nasimuzzaman]
Created On: [December 27, 2024]
GitHub: [https://github.com/dev-nasimuzzaman]

Description:
[This program defines an Engine class in the com.example.car package. The class has a private instance variable horsePower,
which represents the engine's horsepower. The constructor initializes this variable when creating an Engine object.
The start method is used to print the horsepower of the engine to the console.]

Modification History:
Date           Author            Description
------------   ---------------   ---------------------------------------------------------------------------------------
[12/27/2024]   Md Nasimuzzaman   Initial version of the code.
________________________________________________________________________________________________________________________
*/
package com.example.car;

public class Engine {
    private int horsePower;
    public Engine(int horsePower){
        this.horsePower = horsePower;
    }
    public void start(){
        System.out.println("Engine Horse Power :" + horsePower);
    }
}
