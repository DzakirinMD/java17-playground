package base.collection;

import java.util.*;

/**
 * Java Map is an object that maps keys to values. A map cannot contain duplicate keys: Each key can map to at most one value.
 * The Java platform contains three general-purpose Map implementations: HashMap, TreeMap, and LinkedHashMap.
 * The basic operations of Map are put, get, containsKey, containsValue, size, and isEmpty.
 */
public class MapExample {
    public void hashMap() {
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        // To add into HashMap
        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println("To add into HashMap use put() method : " + capitalCities);

        // To check the HashMap size
        System.out.println("To find out how many items there are, use the size() method: " + capitalCities.size());


        // To access HashMap
        System.out.println("To access HashMap, use get() method and refer to its key eg: \ncapitalCities.get(\"USA\") = " + capitalCities.get("USA"));

        // To print out all the element in the HashMap
        System.out.println("To print out all the element in the HashMap ");
        capitalCities.forEach((key, value) ->
            System.out.println("key: " + key + " value: " + value)
        );

//        for (String i : capitalCities.keySet()) {
//            System.out.println("key: " + i + " value: " + capitalCities.get(i));
//        }

        // To find unique element in hashmap. We put the map into set. so everthing become unique
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Java");
        map.put(2, "Python");
        map.put(3, "Java"); // Duplicate value
        map.put(4, "C++");

        // Get all values, then filter duplicates using a HashSet
        Set<String> uniqueValues = new HashSet<>(map.values());

        System.out.println("Unique Values in HashMap: " + uniqueValues);

        // Remove an Item in HashMap
        System.out.println("To remove an item  in HashMap, use remove() method and refer to its key eg: \ncapitalCities.remove(\"USA\") = " + capitalCities.remove("USA"));
        System.out.println("USA is removed : " + capitalCities);

        // To remove all items, use the clear() method
        System.out.println("To remove all items, use the clear() method ");
        capitalCities.clear();
        System.out.println("The Hashmap is now empty : " + capitalCities);
    }

    public void treeMap() {
        System.out.println("\nTreeMap: ");

        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Maple", 3);
        treeMap.put("Pine", 5);
        treeMap.put("Teak", 1);

        // Iterate over the TreeMap using forEach
        treeMap.forEach((key, value) -> System.out.println(key + ": " + value));
    }

    public void linkedHashMap() {
        System.out.println("\nLinkedHashMap: ");

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("apple", 9);
        linkedHashMap.put("banana", 5);
        linkedHashMap.put("orange", 4);

        // Get the value for the "banana" key (to update the access order)
        linkedHashMap.get("banana");

        // Iterate over the LinkedHashMap using forEach
        linkedHashMap.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
