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

