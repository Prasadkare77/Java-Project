import java.util.*;

public class Functions {

//    public static void printMyName(String name){
//        System.out.println(name);
//        return;
//    }


//    Addition of two numbers
//    public static int calculateSum(int a,int b){
//        int sum= a+b;
//        return sum;
//    }


//    Multiplication of 2 Numbers
//    public static int productOfTwo(int a, int b){
//        return a*b;
//    }


//    Find the factorial of the number
//    n!= n*(n-1)*(n-2)*(n-3)*_______*1
      public static void printFactorial(int n){
          if (n<0){
              System.out.println("Invalid Number");
              return;
          }
          int factorial =1;
          for (int i=n; i>=1; i--){
              factorial = factorial * i;
          }
          System.out.println(factorial);
          return;
      }

    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
//        String name = sc.next();
//        printMyName(name); // calling function printMyName

//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int sum = calculateSum(a,b);
//        System.out.println("Addition of two numbers is:"+sum);

//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        System.out.println("Product of two numbers is:"+productOfTwo(a,b));

        int n = sc.nextInt();
        printFactorial(n);
    }
}
