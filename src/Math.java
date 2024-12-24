public class Math {
    //static method multiplication
    public static int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        //calling a static methods directly we can access using class name
        int result = Math.multiply(3, 6);
        System.out.println(result);
    }
}
