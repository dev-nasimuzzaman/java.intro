public class Rectangle {
    //public method
    public int calculateArea(int length, int width){
        return length * width;
    }
    public int calculateParameter(int length, int width){
        return 2 * (length * width);
    }
    public static void main(String[] args){
        //creating an instance or object creation
        Rectangle myObj = new Rectangle();
        //calling a method
        int result = myObj.calculateArea(4,6);
        int parameter = myObj.calculateParameter(8,4);
        System.out.println("Area: "+result +" " + "Parameter: " + parameter);
    }
}
