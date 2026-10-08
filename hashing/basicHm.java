package hashing;

import java.util.HashMap;

public class basicHm {
    public static void main(String[] args) {
        //System.out.println("hello");

        HashMap <String, Integer> map = new HashMap<>();

        map.put("Vishal", 99);
        map.put("isha", 90);
        map.put("Shan", 10);

        //System.out.println(map.get("Vishal")); // get rerturn the value of key
       System.out.println( map.size());
        map.remove("Shan");
        System.out.println(map.size());
    }
    
}
