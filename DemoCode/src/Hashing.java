import java.util.*;

public class Hashing {
    public static void main(String arg[]){
        /*HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        System.out.println(set);

        if (set.contains(1)){
            System.out.println("Set Contains 1 ");
        }
        if (!set.contains(6)){
            System.out.println("Set does not contains 6 ");
        }

        set.remove(1);
        if (!set.contains(1)){
            System.out.println("Does not contain 1 ");
        }

        System.out.println("Size of set is: " + set.size());

        Iterator it = set.iterator();
        while (it.hasNext()){
            System.out.print(it.next() + " ");
        }

        if (!set.isEmpty()){
            System.out.println("Set is not empty ");
        }*/


        HashMap<String, Integer> map = new HashMap<>();

        //Insert
        map.put("India", 120);
        map.put("Russia", 80);
        map.put("UAE", 40);
        System.out.println(map);

        map.put("India", 90);
        System.out.println(map);

        //Search
        if (map.containsKey("Bangkok")){
            System.out.println("Key is exist in data");
        } else {
            System.out.println("Key does not exits in data");
        }
        //Key data
        System.out.println(map.get("UAE"));
        System.out.println(map.get("Indonesia"));

        //Iteration in Hashmap
        //Map.Entry<Integer, Integer> e : Map.entrySet();
        int arr[] = {98,60,99};
        for (int val : arr){
            System.out.print(val + " ");
        }
        System.out.println();

        for (Map.Entry<String,Integer> e : map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        Set<String> keys = map.keySet();
        for (String key : keys){
            System.out.println(key + " " + map.get(key));
        }

        map.remove("UAE");
        System.out.println(map);
    }
}
