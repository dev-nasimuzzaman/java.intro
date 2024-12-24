interface Sports{
    void play();
}
class Cricket implements Sports{
    @Override
    public void play(){
        System.out.println("Playing cricket");
    }
}
class Football implements Sports{
    @Override
    public void play(){
        System.out.println("Playing Football");
    }
}
public class Polymorphism_Interface {
    public static void main(String[] args){
        //instance Creation
        Cricket obj = new Cricket();
        obj.play();

        Football obj1 = new Football();
        obj1.play();
    }
}
