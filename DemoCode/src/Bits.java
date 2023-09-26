import java.util.*;

public class Bits {

    public static void main(String arg[]) {
        Scanner sc=new Scanner(System.in);

//        1.GetBit
//        int n = 5;
//        int pos = 2;
//        int bitMask = 1 << pos;
//        if ((bitMask & n) == 0) {
//            System.out.println("Bit was Zero");
//        }
//        else {
//            System.out.println("Bit was Nonzero");
//        }

//        2.SetBit
//        int n=5;
//        int pos = 1;
//        int bitMask=1<<pos;
//        int newNumber = bitMask | n;
//        System.out.println(newNumber);

//        3.ClearBit
//        int n=5;
//        int pos=2;
//        int bitMask=1<<pos;
//        int notBitMask=~(bitMask);
//        int newNumber=notBitMask & n;
//        System.out.println(newNumber);

//        4.UpdateBit
        int oper=sc.nextInt();
        int n=5;
        int pos=1;
        int bitMask=1<<pos;
        if(oper==1){
            int newNumber=bitMask | n;
            System.out.println(newNumber);
        }
        else {
            int newBitMask=~(bitMask);
            int newNumber=newBitMask & n;
            System.out.println(newNumber);
        }
    }
}
