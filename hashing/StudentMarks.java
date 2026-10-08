package hashing;
import java.util.*;

public class StudentMarks {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Vishal", 99);
        map.put("Biraj", 97);
        map.put("Hashi", 90);
        map.put("Mukesh", 40);

        // Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // if ( map.containsKey(name)){
        //     System.out.println(name + " exist");
        //     System.out.println("marks " + map.get(name));
        // }
        // else System.out.println("not exist");

        // sc.close();

        // if ( map.containsKey("Vishal")){
        //     map.put("Vishal", 100);
        //     System.out.println("updated value is " + map.get("Vishal"));

        // }
        // else
        //     System.out.println("not exist");
        for(String key : map.keySet()){
            System.out.println(key +" " +map.get(key));
        }
    }
}
