package base.collection;

/**
 * "Collections is a utility classes". Iterating, sorting, and searching are most widelyy used collections functions
 * Below are some Popular Collections:
 * Map      ---> HashMap, TreeMap, and LinkedHashMap
 * List     ---> ArrayList, LinkedList
 * Set      ---> HashSet, TreeSet
 * Queue    ---> PriorityQueue, LinkedList
 * Iterator
 */
public class Collections {
    public static void main(String[] args) {

        // Map Example
        System.out.println("\n------- Map Example -------");
        MapExample mapExample = new MapExample();
        mapExample.hashMap();
        mapExample.treeMap();
        mapExample.linkedHashMap();

        // Set example
        System.out.println("\n------- Set Example -------");
        SetExample setExample = new SetExample();
        setExample.hashSet();
        setExample.treeSet();

        // List example
        System.out.println("\n------- List Example -------");
        ListExample listExample = new ListExample();
        listExample.arrayList();
        listExample.linkedList();

        // Queue example
        System.out.println("\n------- Queue Example -------");
        QueueExample queueExample = new QueueExample();
        queueExample.linkedListQueue();
        queueExample.priorityQueue();

    }
}