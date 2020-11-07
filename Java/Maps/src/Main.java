import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // create two hash maps
        HashMap <Integer,String> hash_map1 = new HashMap <Integer,String> ();
        HashMap <Integer,String> hash_map2 = new HashMap <Integer,String> ();
        // populate hash maps
        hash_map1.put(1, "Red");
        hash_map1.put(2, "Green");
        hash_map1.put(3, "Black");
        System.out.println("\nValues in first map: " + hash_map1);
        hash_map2.put(4, "White");
        hash_map2.put(5, "Blue");
        hash_map2.put(6, "Orange");
        System.out.println("\nValues in second map: " + hash_map2);

        hash_map1.putAll(hash_map2);
        System.out.println(hash_map1);
        boolean result = hash_map1.isEmpty();

        System.out.println("Is hash map empty: " + result);
        // Removing all the elements from the linked map
        hash_map1.clear();
        // check if map is empty
        result = hash_map1.isEmpty();
        // check the result
        System.out.println("Is hash map empty: " + result);

        HashMap cloneMap = new HashMap();

        cloneMap = (HashMap) hash_map1.clone();
        System.out.println("Cloned map: " + cloneMap);
    }
}
