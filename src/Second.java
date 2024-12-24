public class Second {
    public static void main(String[] args){
        //object instance creation
        First myObj = new First();
        myObj.fullThrottle(); //calling a first class method
        myObj.speed(150); //calling speed method
        myObj.speed(300);
    }
}
