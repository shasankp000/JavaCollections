// Maps
// A Map is a collection that maps keys to values, with no duplicate keys allowed.
// Common implementations include HashMap and TreeMap.


import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;

public class maps {

    public static void main(String[] args) {

        // Hashmaps
        // A HashMap is a hash table-based implementation of the Map interface. It allows null values and keys.
        // Similar to python's dictionaries which stores values in a key-value pair.

        System.out.println("HashMap: \n");

        Map<Integer, String> hashMap = new HashMap<>(); // initialize the hashmap
        hashMap.put(1, "Apple");
        hashMap.put(2, "Banana");
        hashMap.put(3, "Apple"); // Duplicate values are allowed

        for(Map.Entry<Integer, String> entry: hashMap.entrySet()) { // retrieval from maps will require you to set an entry object which inherits from the entrySet method.

            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());

        }

        System.out.println("\nValue for key 1: " + hashMap.get(1));
        hashMap.remove(1);
        System.out.println("After removing key 1: " + hashMap);


        // Treemap
        // A TreeMap is a Red-Black tree-based implementation of the NavigableMap interface. It stores its entries in sorted order based on the keys.

        System.out.println("\nTreeMap: \n");

        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(2, "Banana");
        treeMap.put(1, "Apple");
        treeMap.put(3, "Orange");

        // input keys are un-sorted.

        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        } // output keys will be sorted.

        System.out.println("\nValue for key 2: " + treeMap.get(2));
        treeMap.remove(2);
        System.out.println("After removing key 2: " + treeMap);

    }
}
