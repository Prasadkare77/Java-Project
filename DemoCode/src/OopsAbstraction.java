abstract class Animal{
    abstract void walk();
    Animal(){
        System.out.println("Yor are creating New Animal");
    }
    public void eat(){
        System.out.println("Animal eats");
    }
}
class Horse extends Animal{
    Horse(){
        System.out.println("Your created Horse");
    }
    public void walk(){
        System.out.println("Walk on four legs");
    }
}
class Elephant extends Animal{
    public void walk(){
        System.out.println("Walk on four legs");
    }
}
public class OopsAbstraction {
    public static void main(String arg[]){
        Horse h = new Horse();
//        h.walk();
//        h.eat();
        Elephant e = new Elephant();
//        e.walk();
    }
}
