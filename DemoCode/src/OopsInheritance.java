class Shape{
    String Size;
    String color;
    public void area(){
        System.out.println("Area Disply");
    }
}
class Triangle extends Shape{
    public void area(int l, int h){
        int area=l*h;
        System.out.println("Area of Circle is: "+area);
    }
}
class Equilateral extends Triangle{
    public void area(int r){
        Double area=2*3.14*r;
        System.out.println("Area of Circle is: "+area);
    }
}
public class OopsInheritance {
    public static void main(String arg[]){
        Equilateral t1 = new Equilateral();
        t1.color="Black";
        t1.area(5,6);
        t1.area(3);
    }
}
