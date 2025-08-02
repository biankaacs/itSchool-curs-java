package org.example.session17.homework;

public class TreeMap {
    public static void main(String[] args) {
        //1.Write a Java program to associate the specified value with the specified key in a Tree Map.
        java.util.TreeMap<String, Integer> treeMap = new java.util.TreeMap<>();
        treeMap.put("Apple", 1);
        treeMap.put("Banana", 2);
        treeMap.put("Cherry", 3);
        System.out.println("Tree Map after adding elements: " + treeMap);

        //2.Write a Java program to copy a Tree Map content to another Tree Map.
        java.util.TreeMap<String, Integer> copiedTreeMap = new java.util.TreeMap<>(treeMap);
        System.out.println("Copied Tree Map: " + copiedTreeMap);

        //3.Write a Java program to search a key in a Tree Map.
        String searchKey = "Banana";
        if (treeMap.containsKey(searchKey)) {
            System.out.println("Key '" + searchKey + "' found in Tree Map with value: " + treeMap.get(searchKey));
        } else {
            System.out.println("Key '" + searchKey + "' not found in Tree Map.");
        }

        //4.Write a Java program to search a value in a Tree Map.
        Integer searchValue = 2;
        if (treeMap.containsValue(searchValue)) {
            System.out.println("Value '" + searchValue + "' found in Tree Map with key: " + getKeyByValue(treeMap, searchValue));
        } else {
            System.out.println("Value '" + searchValue + "' not found in Tree Map.");
        }

        //5.Write a Java program to get all keys from the given a Tree Map.
        System.out.println("Keys in the Tree Map: " + treeMap.keySet());

        //6.Write a Java program to delete all elements from a given Tree Map.
        treeMap.clear();
        System.out.println("Tree Map after clearing: " + treeMap);

        //7.Write a Java program to sort keys in Tree Map by using comparator.
        java.util.TreeMap<String, Integer> sortedTreeMap = new java.util.TreeMap<>(java.util.Collections.reverseOrder());
        sortedTreeMap.put("Apple", 1);
        sortedTreeMap.put("Banana", 2);
        sortedTreeMap.put("Cherry", 3);
        System.out.println("Sorted Tree Map in reverse order: " + sortedTreeMap);

        //8.Write a Java program to get a key-value mapping associated with the greatest key and the least key in a map.
        String firstKey = treeMap.firstKey();
        String lastKey = treeMap.lastKey();
        System.out.println("First key (lowest): " + firstKey);
        System.out.println("Last key (highest): " + lastKey);
        System.out.println("Key-Value mapping for first key: " + firstKey + " = " + treeMap.get(firstKey));
        System.out.println("Key-Value mapping for last key: " + lastKey + " = " + treeMap.get(lastKey));

        //9.Write a Java program to get the first (lowest) key and the last (highest) key currently in a map.
        if (!treeMap.isEmpty()) {
            String lowestKey = treeMap.firstKey();
            String highestKey = treeMap.lastKey();
            System.out.println("Lowest key: " + lowestKey);
            System.out.println("Highest key: " + highestKey);
        } else {
            System.out.println("Tree Map is empty.");
        }

        //10.Write a Java program to get a reverse order view of the keys contained in a given map.
        java.util.TreeMap<String, Integer> reverseOrderMap = new java.util.TreeMap<>(java.util.Collections.reverseOrder());
        reverseOrderMap.putAll(treeMap);
        System.out.println("Reverse order view of keys: " + reverseOrderMap.keySet());

        //11.Write a Java program to get a key-value mapping associated with the greatest key less than or equal to the given key.
        String givenKey = "Banana";
        String greatestKeyLessThanOrEqual = treeMap.floorKey(givenKey);
        if (greatestKeyLessThanOrEqual != null) {
            System.out.println("Greatest key less than or equal to '" + givenKey + "': " + greatestKeyLessThanOrEqual);
            System.out.println("Value associated with this key: " + treeMap.get(greatestKeyLessThanOrEqual));
        } else {
            System.out.println("No key less than or equal to '" + givenKey + "' found in the Tree Map.");
        }

        //12.Write a Java program to get the greatest key less than or equal to the given key.
        String greatestKeyLessThanOrEqualToGiven = treeMap.floorKey(givenKey);
        if (greatestKeyLessThanOrEqualToGiven != null) {
            System.out.println("Greatest key less than or equal to '" + givenKey + "': " + greatestKeyLessThanOrEqualToGiven);
        } else {
            System.out.println("No key less than or equal to '" + givenKey + "' found in the Tree Map.");
        }

        //13.Write a Java program to get the portion of a map whose keys are strictly less than a given key.
        String key = "Cherry";
        java.util.TreeMap<String, Integer> portionLessThanKey = new java.util.TreeMap<>(treeMap.headMap(key, false));
        System.out.println("Portion of the map with keys strictly less than '" + key + "': " + portionLessThanKey);

        //14.Write a Java program to get the portion of this map whose keys are less than (or equal to, if inclusive is true) a given key.
        java.util.TreeMap<String, Integer> portionLessThanOrEqualToKey = new java.util.TreeMap<>(treeMap.headMap(key, true));
        System.out.println("Portion of the map with keys less than or equal to '" + key + "': " + portionLessThanOrEqualToKey);

        //15.Write a Java program to get the least key strictly greater than the given key. Return null if there is no such key.
        String leastKeyGreaterThanGiven = treeMap.higherKey(givenKey);
        if (leastKeyGreaterThanGiven != null) {
            System.out.println("Least key strictly greater than '" + givenKey + "': " + leastKeyGreaterThanGiven);
        } else {
            System.out.println("No key strictly greater than '" + givenKey + "' found in the Tree Map.");
        }

        //16.Write a Java program to get a key-value mapping associated with the greatest key strictly less than the given key. Return null if there is no such key.
        String greatestKeyStrictlyLessThanGiven = treeMap.lowerKey(givenKey);
        if (greatestKeyStrictlyLessThanGiven != null) {
            System.out.println("Greatest key strictly less than '" + givenKey + "': " + greatestKeyStrictlyLessThanGiven);
            System.out.println("Value associated with this key: " + treeMap.get(greatestKeyStrictlyLessThanGiven));
        } else {
            System.out.println("No key strictly less than '" + givenKey + "' found in the Tree Map.");
        }

        //17.Write a Java program to get the greatest key strictly less than the given key. Return null if there is no such key.
        String greatestKeyStrictlyLessThan = treeMap.lowerKey(givenKey);
        if (greatestKeyStrictlyLessThan != null) {
            System.out.println("Greatest key strictly less than '" + givenKey + "': " + greatestKeyStrictlyLessThan);
        } else {
            System.out.println("No key strictly less than '" + givenKey + "' found in the Tree Map.");
        }
    }
    private static String getKeyByValue(java.util.TreeMap<String, Integer> map, Integer value) {
        for (java.util.Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue().equals(value)) {
                return entry.getKey();
            }
        }
        return null; // Return null if the value is not found
    }

}
