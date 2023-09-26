import java.util.*;

public class Recursion3 {

//    Q.Print all permutations of a string.("abc")
//    public static void printPerm(String str, String permutation){
//        if(str.length()==0){
//            System.out.println(permutation);
//            return;
//        }
//        for (int i=0; i<str.length(); i++){
//            char currChar=str.charAt(i);
//            String newStr=str.substring(0,i) + str.substring(i+1);
//            printPerm(newStr,permutation+currChar);
//        }
//    }

//    Q.Count total paths in a maze to move from (0,0) to (n,m) n=3,m=3
//    public static int countPaths(int i, int j, int n, int m){
//        if (i==n || j==m){
//            return 0;
//        }
//        if(i==n-1 && j==m-1){
//            return 1;
//        }
//        int downPaths=countPaths(i+1,j,m,n);
//        int rightPaths=countPaths(i, j+1, n, m);
//        return downPaths + rightPaths;
//    }

//    Q.Place Tiles of size 1*m in floor of size n*m. n=4,m=2
//    public static int placeTiles(int n,int m){
//        if(n==m){
//            return 2;
//        }
//        if (n<m){
//            return 1;
//        }
//        int verticalPlace=placeTiles(n-m,m);
//        int horizontalPlace=placeTiles(n-1,m);
//        return verticalPlace+horizontalPlace;
//    }

//    Q.Find the number of ways in which you can invite n people to your party,singles or in pairs
//           n=4.
//    public static int callGuest(int n){
//        if(n<=1){
//            return 1;
//        }
//        int single=callGuest(n-1);
//        int pairs=(n-1) * callGuest(n-2);
//        return single+pairs;
//    }

//    Q.Print all subsets of a set of first n natural numbers. n=3
    public static void printSubset(ArrayList<Integer> subset){
        for (int i=0; i<subset.size(); i++){
            System.out.print(subset.get(i));
        }
        System.out.println();
    }
    public static void findSubsets(int n, ArrayList<Integer> subset){
        if(n==0){
            printSubset(subset);
            return;
        }
        subset.add(n);
        findSubsets(n-1,subset);
        subset.remove(subset.size()-1);
        findSubsets(n-1, subset);
    }
    public static void main(String arg[]){

//        String str="abc";
//        printPerm(str,"");

//        int n=3, m=3;
//        int totalpath=countPaths(0,0,n,m);
//        System.out.println(totalpath);

//        int n=4, m=4;
//        System.out.println(placeTiles(n,m));

//        int n=4;
//        System.out.println(callGuest(n));

        int n=3;
        ArrayList<Integer> subset=new ArrayList<>();
        findSubsets(n,subset);
    }
}
