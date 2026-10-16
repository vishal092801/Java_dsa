package Collection;
import java.util.*;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list);

        list.remove(3);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.contains(10));
        System.out.println(list.get(2));

    }
    
}
