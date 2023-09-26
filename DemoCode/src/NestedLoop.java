
public class NestedLoop {
    public static void main(String arg[]) {

        /*****
         *****
         *****
         *****
         int m=4;
         int n=5;
         for(int i=1; i<=m; i++){
         for(int j=1; j<=n; j++){
         System.out.print("*");
         }
         System.out.println();
         }*/

        /*****
         *   *
         *   *
         *****

         for(int i=1; i<=m; i++){
         for(int j=1; j<=n; j++){
         if(i==1 || j==1 || i==m || j==n){
         System.out.print("*");
         }
         else {
         System.out.print(" ");
         }
         }
         System.out.println();
         }*/

        /**
         **
         ***
         ****

         int m=4;
         for(int i=1; i<=m; i++){
         for(int j=1; j<=i; j++){
         System.out.print("*");
         }
         System.out.println();
         }*/

        /****
         ***
         **
         *

         int m=4;
         for (int i=m; i>=1; i--){
         for(int j=1; j<=i; j++){
         System.out.print("*");
         }
         System.out.println();
         }*/

        /**
         *
         **
         ***
         ****

         int m=4;
         for(int i=1; i<=m; i++){
         for(int j=1; j<=m-i; j++){
         System.out.print(" ");
         }
         for (int j=1; j<=i; j++){
         System.out.print("*");
         }
         System.out.println();
         }*/

        /**
         1
         12
         123
         1234


         int num=5;
         for(int i=1; i<=num; i++){
         for (int j=1; j<=i; j++){
         System.out.print(j+" ");
         }
         System.out.println();
         }*/

        /**
         12345
         1234
         123
         12
         1

         int num=5;
         for (int i=num; i>=1; i--){
         for(int j=1; j<=i; j++){
         System.out.print(j+" ");
         }
         System.out.println();
         }*/

        /**
         1
         2 3
         4 5 6
         7 8 9 10

         int m=5;
         int numb=1;
         for (int i=1; i<=m; i++){
         for(int j=1; j<=i; j++){
         System.out.print(numb+" ");
         numb++;
         }
         System.out.println();
         }*/


        /**
         1
         0 1
         1 0 1
         0 1 0 1
         1 0 1 0 1

         int m=5;
         for( int i=1; i<=m; i++){
         for( int j=1; j<=i; j++){
         int sum = i+j;
         if(sum % 2==0){
         System.out.print("1 ");
         }
         else {
         System.out.print("0 ");
         }
         }
         System.out.println();
         }*/


        /**Problem Statement
         Print a solid rhombus.
         *****
         *****
         *****
         *****
         *****


         int m=5;

         for (int i=1; i<=m; i++){
         for (int j=1; j<=m-i; j++){
         System.out.print(" ");
         }
         for (int j=1; j<=m; j++){
         System.out.print("*");
         }
         System.out.println();
         }*/


        /**1
         2 2
         3 3 3
         4 4 4 4

         int m=5;
         for (int i=1; i<=m; i++){
         for (int j=1; j<=m-i; j++){
         System.out.print(" ");
         }
         for (int j=1; j<=i; j++){
         System.out.print(i+" ");
         }
         System.out.println();
         }*/

//        int m = 5;
//        for (int i=1; i<=m; i++) {
//            for (int j=1; j<=m-i; j++) {
//                System.out.print(" ");
//            }
//            for (int j=i; j>=1; j--){
//                System.out.print(j);
//            }
//            for (int j=2; j<=i; j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }

        int m = 5;
        for (int i=1; i<=m; i++){
            for (int j=1; j<=i-1; j++){
                System.out.print(" ");
            }
            //UpperLeftPart
            for (int j=1; j<=m; j++){
                if (j==1) {
                    System.out.print(i);
                }
            }
            for (int j=m-i; j>=1; j--){
                System.out.print("_");
            }

            //UpperRightPart
            for (int j=m-i-1; j>=1; j--){
                System.out.print("_");
            }
            for (int j=1; j<=m-i; j++){
                if (j==1) {
                    System.out.print(i);
                }
            }
            System.out.println();
        }

        //LowerPart
        for (int i=1; i<=m; i++){
            for (int j=1; j<=i-1; j++){
                System.out.print(" ");
            }
            for (int j=m-i; j>=1; j--){
                if (i==1) {
                    System.out.print("_");
                }
            }
            //UpperLeftPart
            for (int j=1; j<=m; j++){
                if (i==1) {
                    System.out.print(i);
                }
            }
            System.out.println();
        }
    }
}
