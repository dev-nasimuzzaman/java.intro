public class Polymorphism_Method_Overloading {
    //method with 2 parameters
    static int add(int a, int b){
        return a + b;
    }
    //method with 3 parameters
    static int add(int a, int b, int c){
        return a + b + c;
    }
    //method with 2 double data type parameter
    static double add(double a, double b){
        return a + b;
    }
    static String add(String a, String b){
        return a + b;
    }
    public static void main(String[] args){
        //calling overloaded methods
        int sum1 = add(5, 8);
        int sum2 = add(2,3,7);
        double sum3 = add(3.2, 5.6);

        // display the result
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
    }
}
