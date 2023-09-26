import java.util.Scanner;

public class Recursion1 {
    //Print the numbers from 1 to 5.
//    public static void printNumb(int n){
//        if(n==6){
//            return;
//        }
//        System.out.println(n);
//        printNumb(n+1);
//    }

//    Print the sum of first n natural numbers
//    public static void calcSum(int i, int n, int sum){
//        if(i==n){
//            sum+=i;
//            System.out.println(sum);
//            return;
//        }
//        sum+=i;
//        calcSum(i+1,n,sum);
//    }

//    Print Factorial of n numbers
//    public static int calcFactorial(int n){
//        if(n==1 || n==0){
//            return 1;
//        }
//        int fact_nm1=calcFactorial(n-1);
//        int fact=n*fact_nm1;
//        return fact;
//    }

//    Print the Fibonacci sequence till nth term.
//    public static void printFib(int a, int b, int n){
//        if(n==0){
//            return;
//        }
//        int c=a+b;
//        System.out.println(c);
//        printFib(b,c,n-1);
//    }

//    Print X^n (Stack Height=n)
//    public static int calcPower(int x, int n){
//        if(x==0){
//            return 0;
//        }
//        if (n==0){
//            return 1;
//        }
//        int xPownm1=calcPower(x,n-1);
//        int xPown=x*xPownm1;
//        return xPown;
//    }

//    Print X^n (Stack Height=logn)
    public static int calcPower(int x, int n){
        if(x==0){
            return 0;
        }
        if (n==0){
            return 1;
        }
        if(n%2==0){
            return calcPower(x,n/2) * calcPower(x,n/2);
        }
        else {
            return calcPower(x,n/2) * calcPower(x,n/2) * x;
        }
    }

    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
//        int n=1;
//        printNumb(n);

//        calcSum(1,5,0);

//        int ans=calcFactorial(5);
//        System.out.println(ans);

//        int a=0, b=1;
//        System.out.println(a);
//        System.out.println(b);
//        int n=5;
//        printFib(a,b,n-2);

        int x=2, n=5;
        int ans=calcPower(x,n);
        System.out.println(ans);
    }
}
