package base.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

/**
 * - Use ArrayList when you need fast random access to elements, and the collection will not be frequently modified.
 *
 * - Use LinkedList when you frequently add or remove elements from the collection, particularly from the beginning
 * or end of the list, and random access is not a priority.
 *
 * List is typically used when ordering and duplicate elements are important, and you need to perform operations
 * like adding or removing elements in specific positions.
 *
 */
public class ListExample {

    /**
     * Data structure   -> Implemented as a dynamic array
     * Performance      -> Fast constant-time performance for get/set operations (O(1))
     * Memory           -> Uses less memory
     * Random Access    -> Provides fast random access to elements via the get(int index) method
     */
    public void arrayList() {
        ArrayList<String> cars = new ArrayList<String>();

        // To add into ArrayList
        cars.add("Volvo");
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.add("Mazda");
        System.out.println( " The cars ArrayList consist of : " + cars);

        // To access ArrayList
        System.out.println( " To access ArrayList, use get() method and refer to the index. eg: \n cars.get(1) = " + cars.get(1));

        // To modify ArrayList
        System.out.println( " To modify ArrayList, use set() method and refer to the index. eg:");
        cars.set(1, "Perodua");
        System.out.println( " cars.get(1) = " + cars.get(1));

        // To remove an element in ArrayList
        System.out.println( " To remove an element in ArrayList, use remove() method and refer to the index.");
        cars.remove(0);
        System.out.println( " The Volvo has been removed, since its at index 1 " + cars);

        //To find the size of ArrayList
        System.out.println(" To find out how many elements an ArrayList have, use the size method: " + cars.size());

        //To print out all the element in the ArrayList
        System.out.println("\nTo loop through all the element in the ArrayList : ");
        // 2 ways to do it. by using for loop or for-each loop
        // 1. using for loop
        for (int i = 0 ; i < cars.size() ; i ++){
            System.out.println(" Array index no : " + i + ", Value : " + cars.get(i));
        }
        // 2. using for-each loop
//        for (String i : cars){
//            System.out.println(i);
//        }
//        cars.forEach(i -> System.out.println(i));

        //To sort ArrayList
        System.out.println("\nThe ArrayList has been sorted using Collections.sort() : ");
        Collections.sort(cars);
        for (String i : cars){
            System.out.println(" " + i);
        }

        // To find unique element in arraylist
        var uniqueElement = cars.stream()
                .distinct()
                .toList();
        System.out.println(" The duplicated element in cars ArrayList : " + uniqueElement);

        //To remove all the elements in the ArrayList
        System.out.println("To remove all the elements in the ArrayList, use the clear() method: ");
        cars.clear();
        System.out.println( " The cars ArrayList is now empty : " + cars);
    }

    /**
     * Data structure   -> Implemented as a doubly linked list
     * Performance      -> Fast constant-time performance for add/remove operations, particularly for large collections, because adding or removing elements only requires updating a few pointers
     * Memory           -> Uses more memory. It need to store pointer
     * Random Access    -> Provides slow random access to elements. Requires traversal from the beginning or end of the list to reach a specific element,
     */
    public void linkedList() {
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);

        cars.forEach(i -> System.out.println(i));
    }
}
