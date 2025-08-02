package org.example.session17.homework;

public class HashSet {
    public static void main(String[] args) {
        java.util.HashSet<String> colors = new java.util.HashSet<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        System.out.println("Colors in the HashSet: " + colors);
        iterateColors(colors);
        addColor(colors, "Purple");
        clearColors(colors);
        getSize(colors);
        isEmpty(colors);
        cloneHashSet(colors);
        convertToArray(colors);
        convertToTreeSet(colors);
        convertToList(colors);
        java.util.HashSet<String> anotherColors = new java.util.HashSet<>();
        anotherColors.add("Red");
        anotherColors.add("Green");
        anotherColors.add("Blue");
        anotherColors.add("Yellow");
        compareHashSets(colors, anotherColors);
        retainCommonElements(colors, anotherColors);
        removeAllElements(colors);
        System.out.println("Final HashSet: " + colors);
    }
    //1.Write a Java program to append the specified element to the end of a hash set.
    public static void addColor(java.util.HashSet<String> colors, String color) {
        colors.add(color);
        System.out.println("After adding " + color + ": " + colors);
    }
    //2.Write a Java program to iterate through all elements in a hash list.
    public static void iterateColors(java.util.HashSet<String> colors) {
        System.out.println("Iterating through colors in HashSet:");
        for (String color : colors) {
            System.out.println(color);
        }
    }
    // 3.Write a Java program to get the number of elements in a hash set.
    public static void getSize(java.util.HashSet<String> colors) {
        System.out.println("Number of elements in HashSet: " + colors.size());
    }
    // 4.Write a Java program to empty a hash set.
    public static void clearColors(java.util.HashSet<String> colors) {
        colors.clear();
        System.out.println("HashSet after clearing: " + colors);
    }
    //5.Write a Java program to test a hash set is empty or not.
    public static void isEmpty(java.util.HashSet<String> colors) {
        if (colors.isEmpty()) {
            System.out.println("HashSet is empty.");
        } else {
            System.out.println("HashSet is not empty.");
        }
    }
    //6.Write a Java program to clone a hash set to another hash set.
    public static void cloneHashSet(java.util.HashSet<String> colors) {
        java.util.HashSet<String> clonedSet = new java.util.HashSet<>(colors);
        System.out.println("Cloned HashSet: " + clonedSet);
    }
    //7.Write a Java program to convert a hash set to an array.
    public static void convertToArray(java.util.HashSet<String> colors) {
        String[] colorsArray = colors.toArray(new String[0]);
        System.out.println("HashSet converted to array: ");
        for (String color : colorsArray) {
            System.out.println(color);
        }
    }
    //8.Write a Java program to convert a hash set to a tree set.
    public static void convertToTreeSet(java.util.HashSet<String> colors) {
        java.util.TreeSet<String> treeSet = new java.util.TreeSet<>(colors);
        System.out.println("HashSet converted to TreeSet: " + treeSet);
    }
    //9.Write a Java program to convert a hash set to a List/ArrayList.
    public static void convertToList(java.util.HashSet<String> colors) {
        java.util.ArrayList<String> colorList = new java.util.ArrayList<>(colors);
        System.out.println("HashSet converted to ArrayList: " + colorList);
    }
    //10.Write a Java program to compare two hash set.
    public static void compareHashSets(java.util.HashSet<String> set1, java.util.HashSet<String> set2) {
        java.util.HashSet<String> intersection = new java.util.HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("Common elements in both sets: " + intersection);

        java.util.HashSet<String> difference = new java.util.HashSet<>(set1);
        difference.removeAll(set2);
        System.out.println("Elements in set1 but not in set2: " + difference);

        boolean areEqual = set1.equals(set2);
        System.out.println("Are both sets equal? " + areEqual);
    }
    //11.Write a Java program to compare two sets and retain elements which are same on both sets.
    public static void retainCommonElements(java.util.HashSet<String> set1, java.util.HashSet<String> set2) {
        java.util.HashSet<String> commonElements = new java.util.HashSet<>(set1);
        commonElements.retainAll(set2);
        System.out.println("Common elements retained in both sets: " + commonElements);
    }
    //12.Write a Java program to remove all of the elements from a hash set.
    public static void removeAllElements(java.util.HashSet<String> colors) {
        colors.clear();
        System.out.println("HashSet after removing all elements: " + colors);
    }
}
