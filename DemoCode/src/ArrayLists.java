import java.util.*;
public class ArrayLists {
    public static void main(String arg[]){
        ArrayList<Integer> list = new ArrayList<>();

        //add
        list.add(0);
        list.add(1);
        list.add(2);
        System.out.println(list);

        //get
        int element = list.get(0);
        System.out.println(element);

        //add element in between
        list.add(1,10);
        System.out.println(list);

        //set element
        list.set(0,5);
        System.out.println(list);

        //delete element
        list.remove(3);
        System.out.println(list);

        //list size
        System.out.println(list.size());

        //loops
        for (int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

        //sort
        Collections.sort(list);
        System.out.println(list);

        //Q1.Take an array of names as input from the user and print them on the screen.
        ArrayList<String> name = new ArrayList<String>();
            name.add("Prasad");
            name.add("Akshita");

            System.out.println(name);
    }
}
