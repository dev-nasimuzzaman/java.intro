public class Person {
    String name;
    int age;
    //default constructor
    public Person(String n, int a){
        name = n;
        age = a;
    }
    void show(){
        System.out.println("Name: " + name + " "+ "Age: "+ age);

    }
    public static void main(String[] args){
        //creating class instance
        Person myObj = new Person("Nasim", 20);
        myObj.show();
        Person myObj1 = new Person("Samu", 20);
        myObj1.show();
    }
}
