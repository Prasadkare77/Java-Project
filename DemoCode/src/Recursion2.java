import java.util.*;

public class Recursion2 {
//    Q.Tower Of Hanoi
//    public static void towerOfHanoi(int n, String src, String helper, String dest){
//        if(n==1){
//            System.out.println("Transfer Disk "+n+" from "+src+" to "+dest);
//            return;
//        }
//        towerOfHanoi(n-1,src,dest,helper);
//        System.out.println("Transfer Disk "+n+" from "+src+" to "+dest);
//        towerOfHanoi(n-1,helper,src,dest);
//    }

//    Q.Print A String In Reverse("abcd")
//    public static void printString(String str, int idx){
//        if(idx==0){
//            System.out.println(str.charAt(idx));
//            return;
//        }
//        System.out.print(str.charAt(idx));
//        printString(str, idx-1);
//    }

//    Q.Find the first and last occurance of an element in String.("abaacdaefaah")
//    public static int first=-1;
//    public static int last=-1;
//    public static void findOccurance(String str, int idx, char element){
//        if (idx==str.length()){
//            System.out.println(first);
//            System.err.println(last);
//            return;
//        }
//        char currChar=str.charAt(idx);
//        if (currChar==element){
//            if (first==-1){
//                first=idx;
//            }else {
//                last=idx;
//            }
//        }
//        findOccurance(str,idx+1,element);
//    }

//    Q.Check if array is sorted(Strictly Increasing)
//    public static boolean isSorted(int arr[], int idx){
//        if(idx==arr.length-1){
//            return true;
//        }
//        if (arr[idx]<arr[idx+1]){
//            return isSorted(arr,idx+1);
//        }else {
//            return false;
//        }
//    }

//    Q.Move all 'x' to the end of the string.("axbcxxd")
//    public static void moveAllX(String str, int idx, int count, String newStr){
//        if(idx==str.length()){
//            for (int i=0; i<count; i++){
//                newStr+='x';
//            }
//            System.out.println(newStr);
//            return;
//        }
//        char currChar=str.charAt(idx);
//        if (currChar=='x'){
//            count++;
//            moveAllX(str,idx+1,count,newStr);
//        }else {
//            newStr+=currChar;
//            moveAllX(str,idx+1,count,newStr);
//        }
//    }

//    Q.Remove Duplicates in a String ("abbccda")
//    public static boolean[] map= new boolean[26];
//    public static void removeDuplicate(String str, int idx, String newStr){
//        if(idx==str.length()){
//            System.out.println(newStr);
//            return;
//        }
//        char currChar=str.charAt(idx);
//        if(map[currChar-'a']){
//            removeDuplicate(str,idx+1,newStr);
//        }else{
//            newStr+=currChar;
//            map[currChar-'a']=true;
//            removeDuplicate(str,idx+1,newStr);
//        }
//    }

//    Q.Print all the subsequences of string.("abc")
//    public static void printSubSeq(String str,int idx,String newstr){
//        if (idx==str.length()){
//            System.err.println(newstr);
//            return;
//        }
//        char currchar=str.charAt(idx);
//        printSubSeq(str,idx+1,newstr+currchar);
//        printSubSeq(str,idx+1,newstr);
//    }

//    Q.Print all the unique subsequences of string.("aaa")
//    public static void printSubSeq(String str,int idx,String newstr,HashSet<String> set){
//        if (idx==str.length()){
//            if(set.contains(newstr)){
//                return;
//            }else{
//                System.out.println(newstr);
//                set.add(newstr);
//                return;
//            }
//        }
//        char currchar=str.charAt(idx);
//        printSubSeq(str,idx+1,newstr+currchar,set);
//        printSubSeq(str,idx+1,newstr,set);
//    }


//    Q.Print Keypad combination
    public static String[] keypad={".","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static void printCombo(String str,int idx,String combination){
        if(idx==str.length()){
            System.out.print(" "+combination);
            return;
        }
        char currChar=str.charAt(idx);
        String mapping=keypad[currChar-'0'];
        for (int i=0; i<mapping.length(); i++){
            printCombo(str,idx+1,combination+mapping.charAt(i));
        }
    }

    public static void main(String arg[]){
//        int n=3;
//        towerOfHanoi(n,"S","H","D");

//        String str="abcd";
//        printString(str,str.length()-1);

//        String str="abaacdaefaah";
//        findOccurance(str,0,'a');

//        int arr[]={1,2,3,4,5};
//        System.out.println(isSorted(arr,0));

//        String str="axbcxxd";
//        moveAllX(str,0,0,"");

//        String str="abbccda";
//        removeDuplicate(str,0,"");

//        String str="abc";
//        printSubSeq(str,0,"");

//        String str="aaa";
//        HashSet<String> set= new HashSet<>();
//        printSubSeq(str,0,"",set);

        String str="23";
        printCombo(str,0,"");
    }

}
