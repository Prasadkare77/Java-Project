import java.util.*;

public class FunctionPractice {

//    1. Enter 3 numbers from the user & make a function to print their average.
//    public static int averageNumb(int a, int b, int c){
//        int average = (a+b+c)/3;
//        return average;
//    }

//    2.Write a function to print the sum of all odd numbers from 1 to n.
//    public static void oddNumberSum(int n){
//        int sum=0;
//        for (int i=1;i<=n;i++){
//            if(i%2==1){
//                sum =sum+i;
//            }
//        }
//        System.out.println("Sum of Odd Number is:"+sum);
//    }

//    3.Write a function which takes in 2 numbers and returns the greater of those two.
//    public static int printGreater(int a, int b){
//        if(a>b){
//            return a;
//        }
//        else {
//           return b;
//        }
//    }

//    4.Write a function that takes in the radius as input and returns the circumference of a circle.
//    public static double circumCircle(int r){
//        return 2*3.14*r;
//    }

//    5.Write a function that takes in age as input and returns if that person is eligible to vote or not.
//    A person of age > 18 is eligible to vote.
//    public static boolean votingAge(int age) {
//        if (age > 18) {
//            return true;
//        }
//            return false;
//    }

//    6.Write an infinite loop using do while condition.
//    public static void loop(){
//        do{
//
//        }while (true);
//    }

//


    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

//        int a=sc.nextInt();
//        int b=sc.nextInt();
//        int c=sc.nextInt();
//        int average = averageNumb(a,b,c);
//        System.out.println("Average of Three numbers is: "+average);

//        int n=sc.nextInt();
//        oddNumberSum(n);

//        int a=sc.nextInt();
//        int b=sc.nextInt();
//        System.out.println(printGreater(a,b));

//        int r=sc.nextInt();
//        System.out.println("Circumference Of Circle is: "+circumCircle(r));

//        int age=sc.nextInt();
//        System.out.println(votingAge(age));

//        loop();


//        7.Write a program to enter the numbers till the user wants and at the end it should display
//        the count of positive, negative and zeros entered. code is in main method.
//        int p=0, n=0, z=0;
//        System.out.println("Press 1 for continue or 0 for exit");
//        int input=sc.nextInt();
//        while(input==1){
//            System.out.println("Enter Your Number");
//            int number = sc.nextInt();
//            if (number>0){
//                p++;
//            }
//            else if (number<0){
//                n++;
//            }
//            else {
//                z++;
//            }
//            System.out.println("Press 1 for continue or 0 for exit");
//            input=sc.nextInt();
//        }
//        System.out.println("Positives: "+p);
//        System.out.println("Negatives: "+n);
//        System.out.println("Zeros: "+z);


//        8.Two numbers are entered by the user, x and n. Write a function to find the
//        value of one number raised to the power of another i.e. xn.
//        System.out.println("Enter X");
//        int x=sc.nextInt();
//        System.out.println("Enter n");
//        int n=sc.nextInt();
//        int result=1;
//        for(int i=0; i<=n; i++) {
//            result = result * x;
//        }
//        System.out.println("X to the power of n is: "+result);


//        9.Write a function that calculates the Greatest Common Divisor of 2 numbers. (BONUS)
//        int n1=sc.nextInt();
//        int n2=sc.nextInt();
//        while(n1!=n2){
//            if(n1>n2){
//                n1=n1-n2;
//            }
//            else {
//                n2=n2-n1;
//            }
//        }
//        System.out.println("GCD is: "+n2);


//        10.Write a program to print Fibonacci series of n terms where n is input by user :
//        0 1 1 2 3 5 8 13 21 .....
//        In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it.
//        (BONUS)

        int n=sc.nextInt();
        int a=0, b=1;
        System.out.println(a+" ");
        if (n>1){
            for(int i=2; i<=n; i++){
                System.out.println(b+" ");
                int temp=b;
                b=a+b;
                a=temp;
            }
            System.out.println();
        }

    }
}
