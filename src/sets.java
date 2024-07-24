// Sets

/*
* A Set is a collection that does not allow duplicate elements.
* Common implementations include HashSet and TreeSet.
* */

import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;



public class sets {

    public static class DuplicateElementException extends Exception {

        public DuplicateElementException(String message) {
            super(message);
        }

    }

    public static void main(String[] args) throws DuplicateElementException {

        // HashSet

        System.out.println("HastSet: \n");

        Set<String> hashSet = new HashSet<>(); // initializing the HashSet.

        //String[] fruits = {"apple", "banana", "orange", "apple"}; // Using this array for populating the hashset would throw the exception
        String[] fruits = {"apple", "banana", "orange"};


        for(String fruit: fruits) {
            boolean isAdded = hashSet.add(fruit);

            if(!isAdded) {
                throw new DuplicateElementException("Duplicate elements found with name: " + fruit + "!");
            }

        }

        for(String fruit: hashSet) {
            System.out.println(fruit);
        }

        System.out.println("\nTreeSet: \n");

        // Note that the default hashset doesn't maintain the order of the elements as given initially since it uses a hash table.
        // To maintain the order, use LinkedHashSet, which maintains a LinkedList entry of the elements.

        // TreeSet
        // A TreeSet is a NavigableSet implementation based on a TreeMap. It stores elements in a sorted order.

        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Banana");
        treeSet.add("Apple");
        treeSet.add("Orange");

        for (String fruit : treeSet) {
            System.out.println(fruit); // will output as Apple Banana Orange, in the sorted alphabetical order.
        }


    }

}
