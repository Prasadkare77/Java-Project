import java.util.*;
public class Strings {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

//        String name = sc.next();
//        System.out.println("My name is: "+name);
//
//        String Concatenation
//        String firstName="Prasad";
//        String lastName="Kare";
//        String fullName= firstName+" "+lastName;
//        System.out.println("Full Name Is: "+fullName);

//        length
//        System.out.println("Length Is: "+fullName.length());

//        String Character Separate
//         for (int i=0; i<fullName.length(); i++){
//             System.out.print(" "+fullName.charAt(i));
//         }

//        String name1="Prasad";
//        String name2="Akshita";
//        if (name1.compareTo(name2)==0){
//            System.out.println("String are equal");
//        }
//        else {
//            System.out.println("String are not equal");
//        }

//        if (new String("Prasad")==new String("Prasad")){
//            System.out.println("String are equal");
//        }
//        else {
//            System.out.println("String are not equal");
//        }

//        SubString
//        String sentence="My name is Prasad";
//        String name = sentence.substring(11,sentence.length());
//        System.out.println("Substring is: "+name);


//        ParseInt Method of Integer class
//        String str="123";
//        int number=Integer.parseInt(str);
//        System.out.println(number);

//        ToString Method of String class
//        int number=123;
//        String str=Integer.toString(number);
//        System.out.println(str.length());

//        1.Take an array of Strings input from the user & find the cumulative
//        (combined) length of all those strings.
//        int size = sc.nextInt();
//        String array[]=new String[size];
//        int totlength=0;
//
//        for (int i=0; i<size; i++){
//            array[i]=sc.next();
//            totlength=array[i].length();
//        }
//        System.out.println("Length is: "+totlength);


//        2.Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’.
//        Example :
//        original = “eabcdef’ ; result = “iabcdif”
//        Original = “xyz” ; result = “xyz”
//        String str=sc.next();
//        String result="";
//        for (int i=0; i<str.length(); i++){
//            if (str.charAt(i)=='e'){
//                result+='i';
//            }else {
//                result += str.charAt(i);
//            }
//        }
//        System.out.println(result);


//        3.Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.
//        Example :
//        email = “apnaCollegeJava@gmail.com” ; username = “apnaCollegeJava”
//        email = “helloWorld123@gmail.com”; username = “helloWorld123”
//        String email=sc.next();
//        String username="";
//        for (int i=0; i<email.length(); i++){
//            if(email.charAt(i)=='@'){
//                break;
//            }
//            else {
//                username+=email.charAt(i);
//            }
//        }
//        System.out.println("Email is: "+email);
//        System.out.println("Username is: "+username);


//        Reverse String
        String str = "Prasad", nstr = "";
        char ch;
        System.out.println(str);

        for (int i=0; i<str.length(); i++){
            ch = str.charAt(i);
            nstr = ch + nstr;
        }
        if (str.equals(nstr)){
            System.out.println(" palindrome");
        } else {
            System.out.println("Not palindrome");
        }
        System.out.println(nstr);
    }
}
