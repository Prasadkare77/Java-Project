import java.util.*;

public class Loops {
    public static void main(String args[]) {

        /*Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for( int i = 1; i<n; i++)
        {
            if (i % 2 == 0){
                System.out.println(i);
            }

        }*/


        /*Make a menu driven program. The user can enter 2 numbers, either 1 or 0.
        If the user enters 1 then keep taking input from the user for a student’s marks(out of 100).
        If they enter 0 then stop.
        If he/ she scores :
        Marks >=90 -> print “This is Good”
        89 >= Marks >= 60 -> print “This is also Good”
        59 >= Marks >= 0 -> print “This is Good as well”
        Because marks don’t matter but our effort does.
        (Hint : use do-while loop but think & understand why)*/

        /*Scanner sc = new Scanner(System.in);
        int button;
        do {
            System.out.println("Enter Student Marks");
            int marks = sc.nextInt();
            if (marks>=90){
                System.out.println("This is Good");
            }
            else if (89>=marks && marks>= 60){
                System.out.println("This is Good as well");
            }
            else if (59>= marks && marks>=0){
                System.out.println("This is Good as well");
            }
            System.out.println("Do you want to continue to press 1 or exit to press 0");
            button = sc.nextInt();
        }
        while(button==1);*/


        /*Print if a number is prime or not (Input n from the user).
        [In this problem you will learn how to check if a number is prime or not]*/

        Scanner sc = new Scanner(System.in);
        int l=0;
        int m=0;
        int n = sc.nextInt();
        m=n/2;
        if (n==1 || n==0){
            System.out.println("This is not prime number");
        }
        else {
            for(int i=2; i<=m; i++)
            {
                if (n%2==0){
                    System.out.println("This is not prime number");
                    l=1;
                    break;
                }
            }
            if (l==0) {
                System.out.println(n+"This is prime number");
            }
        }
    }
}
