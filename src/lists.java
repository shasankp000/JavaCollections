// Lists

/*
* A List is an ordered collection that allows duplicate elements.
* Common implementations include ArrayList and LinkedList.
* */

// 1. ArrayList

// Faster for retrieving elements.

// 2. LinkedList (already did this in DS). The one here is a doubly linked list implementation
// Faster for inserting or removing elements from beginning or end.

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class lists {

    public static void main(String[] args) {

        // ArrayList

        List<String> arrayList = new ArrayList<>(); // initializing the ArrayList.
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Apple"); // duplicate elements are allowed.

        System.out.println("ArrayList: \n");

        for (String fruit: arrayList) { // elements can be accessed from an arrayList in this way.
            System.out.println(fruit);
        }

        System.out.println("Element at index 1: " + arrayList.get(1));
        arrayList.remove(0);
        System.out.println("After removing element at index 0: " + arrayList);

        System.out.println("\n");
//-----------------------------------------------------------------------------------------------------------------------------

        System.out.println("LinkedList: \n");
        // LinkedList

        List<String> linkedList = new LinkedList<>(); // initializing the LinkedList.
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Apple"); // duplicate elements allowed here as well.



        for (String fruit: linkedList) { // elements can be accessed from an arrayList in this way.
            System.out.println(fruit);
        }

    }

}
