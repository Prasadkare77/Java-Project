class Pen {
    String color;
    String type;

    public void write(){
        System.out.println("Write Something");
    }
    public void printColor(){
        System.out.println("Pen Color is: "+this.color);
    }
    public void penType(){
        System.out.println("Pen Type is: "+this.type);
    }
}
class Student{
    String name;
    int age;
    String mobile;

    public void printInfo(){
        System.out.println("Name: "+this.name);
        System.out.println("Age: "+this.age);
        System.out.println("Mobile no: "+this.mobile);
    }
    //Constructor
    Student(){
        System.out.println("Constructor Called");
    }
    //Paramerized Constructor
    Student(String name, int age, String mobile){
        this.name=name;
        this.age=age;
        this.mobile=mobile;
    }
    //Copy Constructor
    Student(Student s3) {
        this.name = s3.name;
        this.age = s3.age;
        this.mobile = s3.mobile;
    }
}
public class Oops {
    public static void main(String arg[]){
        Pen pen1 = new Pen();
        pen1.color="White";
        pen1.type="InkPen";
        pen1.write();
        pen1.printColor();
        pen1.penType();

        Student s1= new Student();
        s1.name="Prasad";
        s1.age=25;
        s1.mobile="9860994585";
        s1.printInfo();

        Student s2 = new Student("Akshita", 21, "8605784895");
        s2.printInfo();

        Student s3 = new Student(s1);
        s3.printInfo();
    }
}
