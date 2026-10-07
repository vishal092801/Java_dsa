package hashing;
import java.util.*;

public class hash_map {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>(); 
        
        //insert
        map.put("India", 120);
        map.put("Usa ", 30);
        map.put("China", 150);
        //System.out.println(map);

        map.put("China", 180); // if we want to map.put if exist then update
                                        // doest not then new pair is inserted.
        System.out.println(map);
        

        // searching 
        if ( map.containsKey("China")){ 
            System.out.println(" yes it is contain in the map");
        }
        else {
            System.out.println(" not contain in the map");
        }
        // .get

        System.out.println(map.get("India")); // if key exist then return the value 
        System.out.println(map.get("bharat"));
        // if not exist then do not return shows null
        

        // Iterator
        for( Map. Entry<String, Integer> e : map.entrySet ()) {
                System.out. println (e.getKey()); // e contain <"india", 120>
                // when we write e.getkey() its return the  key 
                System.out.println(e.getValue());
                // when we write e.getvalue() its return the value of key.  
        }


    }
    
}
