package hashing;

import java.util.HashSet;
import java.util.Iterator;

public class hash {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        //insert
        set.add(1);
        set.add(2);
        set.add(2);
        set.add(3);
        
       

        // search contain 
        if ( set.contains(1))
            System.out.println("yes its contain");
        if(! set.contains(8))
            System.out.println("Not contains");

        // delete in the set
          set.remove(1);
        if ( ! set.contains(1))
            System.out.println(" does not contain ");
      
        // size of the set
        System.out.println(set.size());
        System.out.println(set);
        // iterator

        Iterator it = set.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
