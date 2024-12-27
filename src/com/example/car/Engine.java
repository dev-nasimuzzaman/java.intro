/*______________________________________________________________________________________________________________________
Author: [Md Nasimuzzaman]
Created On: [December 27, 2024]
GitHub: [https://github.com/dev-nasimuzzaman]

Description:
[-----------------------------------]

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
