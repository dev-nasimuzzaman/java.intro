/*______________________________________________________________________________________________________________________
Author: [Md Nasimuzzaman]
Created On: [December 27, 2024]
GitHub: [https://github.com/dev-nasimuzzaman]

Description:
[-------------------------]

Modification History:
Date           Author            Description
------------   ---------------   ---------------------------------------------------------------------------------------
[12/27/2024]   Md Nasimuzzaman   Initial version of the code.
________________________________________________________________________________________________________________________
*/
package com.example.car;

public class car {
    private String make;
    private String model;

    public car(String make, String model){
        this.make = make;
        this.model = model;
    }

    public void displayinfo(){
        System.out.println("Make : " + make);
        System.out.println("Model : " + model);
    }
}
