public class Encapsulation {
    //private attribute
    private String name;
    private int age;
    //construction
    public Encapsulation(String name, int age){
        this.name = name;
        this.age = age;
    }
    //public getter method for name attribute
    public String getName(){
        return name;
    }
    //setter method for name attribute
    public void setName(String name){
        this.name = name;
    }
    // public getter method for age attribute
    public int getAge() {
        return age;
    }
    // public setter method for age attribute
    public void setAge(int age) {
        if(age > 0){
        this.age = age;
        } else{
            System.out.println("Invalid age");
        }
    }

//display the hidden parameters data
    public void displayInfo(){
        System.out.println("Name :" + name);
        System.out.println("Age :" + age);
    }
    public static void main (String[] args){
        //creating an instance
        Encapsulation encapsulation = new Encapsulation("Nasim", 27);
        encapsulation.displayInfo();
        encapsulation.setName("Samu");
        encapsulation.setAge(26);
        encapsulation.displayInfo();
    }
}
