import java.util.*;

public class Conditions{

    public static void main(String[] arg){
        /*
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if(a % 2==0){
            System.out.println("The Number is Even ");
        }
        else{
            System.out.println("The Number Is Odd");
        }


        /*Make a Calculator. Take 2 numbers (a & b) from the user and an operation as follows :
        1 : + (Addition) a + b
        2 : - (Subtraction) a - b
        3 : * (Multiplication) a * b
        4 : / (Division) a / b
        5 : % (Modulo or remainder) a % b
        Calculate the result according to the operation given and display it to the user.*/

       /* Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Enter 1 for Addition, 2 for subtraction, 3 for mulitiplication, 4 for division, 5 for remainder");
        int oprator = sc.nextInt();
        switch (oprator){
            case 1 :
                int sum = a+b;
                System.out.println("Addition is:"+sum);
                break;

            case 2 :
                int sub = a-b;
                System.out.println("Subtraction is:"+sub);
                break;

            case 3 :
                int mul = a*b;
                System.out.println("Multiplication is:"+mul);
                break;

            case 4 :
                double div = a/b;
                System.out.println("Division is:"+div);
                break;

            case 5 :
                double rem = a%b;
                System.out.println("Remainder is:"+rem);
                break;

            default:
                break;
        }*/


        /*Ask the user to enter the number of the month & print the name of the month.
        For eg - For ‘1’ print ‘January’, ‘2’ print ‘February’ & so on.*/

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        switch (a){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("Octomber");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                break;


        }
    }
}