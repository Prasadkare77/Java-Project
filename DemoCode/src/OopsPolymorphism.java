class Employe{
    String name;
    int age;
    String mobile;
    public void printInfo(String name, String mobile){
        System.out.println(name);
    }
    public void printInfo(int age){
        System.out.println(age);
    }
    public void printInfo(String name, int age, String mobile){
        System.out.println(name+ " " +age+ " " +mobile);
    }
}
public class OopsPolymorphism {
    public static void main(String arg){
        Employe s1 = new Employe();
        s1.name="Prasad";
        s1.age=25;
        s1.mobile="9860994585";
        s1.printInfo(s1.name,s1.age,s1.mobile);

    }
}
