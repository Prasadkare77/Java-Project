package Practice;
import java.util.*;
public class Main {

    public static void printFibb(int a, int b, int n){
        if (n==0){
            return;
        }
        int c = a+b;
        System.out.println(c);
        printFibb(b,c,n-1);
    }
    public static void main(String arg[]){
//        Scanner sc = new Scanner(System.in);
//        int myNumber = (int)(Math.random()*100);
//        int userNumber=0;
//
//        do {
//            System.out.println("Enter your Number (1-100)");
//            userNumber = sc.nextInt();
//
//            if (userNumber == myNumber){
//                System.out.println("Wow Number is Correct");
//                break;
//            } else if (userNumber > myNumber){
//                System.out.println("Number is Large");
//            } else {
//                System.out.println("Number is small");
//            }
//        } while (userNumber >= 0);
//
//        System.out.println("MY Number is: " + myNumber);
//        int n = 5;
//        int a = 0, b = 1;
//        System.out.println(a);
//        System.out.println(b);
//        printFibb(a,b,n-2);

        String name = "abbc";

    }
}
