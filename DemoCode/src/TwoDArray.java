import java.util.*;

public class TwoDArray {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
//        int row = sc.nextInt();
//        int cols = sc.nextInt();
//        int numbers[][]= new int[row][cols];
//
//        for (int i=0; i<row; i++){
//            for (int j=0; j<cols; j++){
//                numbers[i][j]=sc.nextInt();
//            }
//        }
//        for (int i=0; i<row; i++){
//            for (int j=0; j<cols; j++){
//                System.out.print(numbers[i][j]+" ");
//            }
//            System.out.println();
//        }
//        int x=sc.nextInt();
//        for (int i=0; i<row; i++){
//            for (int j=0; j<cols; j++){
//                if (numbers[i][j]==x){
//                    System.out.println("The "+numbers[i][j]+ " is on found on location of " + i +" "+ j);
//                }
//            }
//        }


//        1.Print the spiral order matrix as output for a given matrix of numbers.
        int n=sc.nextInt();
        int m=sc.nextInt();
        int matrix[][]=new int[n][m];

        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("The Spiral Order Matrix is: ");
        int rowStart=0;
        int rowEnd=n-1;
        int colStart=0;
        int colEnd=n-1;

        while(rowStart<=rowEnd && colStart<=colEnd){

            for (int col=colStart; col<=colEnd; col++){
                System.out.print(matrix[rowStart][col]+" ");
            }
            rowStart++;

            for (int row=rowStart; row<=rowEnd; row++){
                System.out.print(matrix[row][colEnd]+" ");
            }
            colEnd--;

            for (int col=colEnd; col>=colStart; col--){
                System.out.print(matrix[rowEnd][col]+" ");
            }
            rowEnd--;

            for (int row=rowEnd; row>=rowStart; row--){
                System.out.print(matrix[row][colStart]+" ");
            }
            colStart++;
            System.out.println();
        }
    }
}
