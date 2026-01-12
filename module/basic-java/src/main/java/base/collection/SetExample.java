package base.collection;

import java.util.HashSet;
import java.util.TreeSet;

/**
 * Set Interface
 * Set is a collection that cannot contain duplicate elements. and unordered collections
 * This interface models the mathematical set abstraction and is used to represent sets, such as the deck of cards.
 * <p>
 * The Java platform contains three general-purpose Set implementations:
 * HashSet, TreeSet, and LinkedHashSet.
 * Set interface doesn’t allow random-access to an element in the Collection.
 * You can use iterator or foreach loop to traverse the elements of a Set.
 *
 * Set is typically used when the uniqueness of elements is important and you need to perform operations like adding or removing elements based on their values, without regard for their positions.
 *
 */
public class SetExample {

    /**
     * - HashSet does not maintain any order
     * - HashSet allows a null object
     */
    public void hashSet() {
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("BBB");
        hashSet.add("AAA");
        hashSet.add("CCC");

        // Add Duplicated Element and print using forEach
        hashSet.add("CCC");
        hashSet.add(null);
        System.out.println("HashSet : ");
        hashSet.forEach(System.out::println);

    }

    /**
     * - TreeSet maintains an object in sorted order
     * - TreeSet does not allow the null object. It throws the null pointer exception.
     */
    public void treeSet() {
        try {
            TreeSet<String> treeSet = new TreeSet<String>();
            treeSet.add("BBB");
            treeSet.add("AAA");
            treeSet.add("CCC");

            // Add Duplicated Element and print using Stream
            treeSet.add("CCC");
//        treeSet.add(null);
            System.out.println("HashSet : ");
            treeSet.stream()
                    .forEach(System.out::println);

        } catch (NullPointerException nullPointerException) {
            System.out.println("TreeSet : \nNull Pointer Exception occur");
        }

    }
}
