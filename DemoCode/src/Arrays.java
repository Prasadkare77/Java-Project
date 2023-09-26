import java.util.*;

public class Arrays {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

//        int[] marks = new int[3];
//        marks[0]=97;
//        marks[1]=88;
//        marks[2]=76;
////        System.out.println(marks[0]);
////        System.out.println(marks[1]);
////        System.out.println(marks[2]);
//        for (int i=0; i<3; i++){
//            System.out.println(marks[i]);
//        }


//        int size = sc.nextInt();
//        int numbers[]=new int[size];
//        // input
//        for(int i=0; i<size; i++){
//            numbers[i] = sc.nextInt();
//        }
//        int x=sc.nextInt();
//
//        // output
//        for (int i=0; i<numbers.length; i++){
//            if(numbers[i]==x){
//                System.out.println("X is found on index: "+i);
//            }
//            //System.out.println(numbers[i]);
//        }


//        1.Take an array of names as input from the user and print them on the screen.
//        int size = sc.nextInt();
//        String names[]=new String[size];
//        for (int i=0; i<size; i++){
//            names[i]=sc.next();
//        }
//        for (int i=0; i< names.length; i++){
//            System.out.println("Name : "+(i+1)+" "+names[i]);
//        }


//        2.Find the maximum & minimum number in an array of integers.
//        int size=sc.nextInt();
//        int number[]=new int[size];
//        for (int i=0; i<size; i++){
//            number[i]=sc.nextInt();
//        }
//        int min=Integer.MIN_VALUE;
//        int max=Integer.MAX_VALUE;
//
//        for (int i=0; i< number.length; i++){
//            if (number[i]<min){
//                min=number[i];
//            }
//            if (number[i]>max){
//                max=number[i];
//            }
//        }
//        System.out.println("Largest Number is: "+max);
//        System.out.println("Minimum number is: "+min);

//        3.Take an array of numbers as input and check if it is an array sorted in ascending order.
//        Eg : { 1, 2, 4, 7 } is sorted in ascending order.
//        {3, 4, 6, 2} is not sorted in ascending order.

        int size=sc.nextInt();
        int numbers[]=new int[size];
        for (int i=0; i<size; i++){
            numbers[i]=sc.nextInt();
        }

        boolean isAscending=true;

        for (int i=0; i< numbers.length-1; i++){
            if(numbers[i]>numbers[i+1]){
                isAscending=false;
            }
        }
        if (isAscending){
            System.out.println("This Array is Sorted in Ascending Order");
        }
        else {
            System.out.println("This Array is not sorted in Ascending Order");
        }

    }
}
