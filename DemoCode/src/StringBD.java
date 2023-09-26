public class StringBD {
    public static void main(String arg[]){
        StringBuilder sb= new StringBuilder("Prasad");
        System.out.println(sb);

        //Char at index
        //System.out.println(sb.charAt(0));

        //Set char at index
        //sb.setCharAt(0,'D');
        //System.out.println(sb);

        //Insert
        //sb.insert(4,'A');
        //System.out.println(sb);

        //Delete
        //sb.delete(4,5);
        //System.out.println(sb);

        //Reverse
//        sb.reverse();
//        System.out.println(sb);

        for (int i=0; i<sb.length()/2; i++){
            int front = i;
            int back = sb.length()-1-i;

            char frontChar=sb.charAt(front);
            char backChar=sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back,frontChar);
        }
        System.out.println(sb);
    }
}
