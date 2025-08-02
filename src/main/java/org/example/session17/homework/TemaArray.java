package org.example.session17.homework;
//1. Write a Java program to create a new array list, add some colors (string) and print out the collection.

public class TemaArray {
    public static void main(String[] args) {
        java.util.ArrayList<String> colors = new java.util.ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        System.out.println("Colors in the list: " + colors);
        iterateColors(colors);
        insertFirst(colors, "Purple");
        System.out.println(retrieveElement(colors, 2));
        updateElement(colors, 1, "Orange");
        removeThirdElement(colors);
        searchElement(colors, "Blue");
        sortColors(colors);
        java.util.ArrayList<String> copiedColors = copyColors(colors);
        System.out.println("Copied colors: " + copiedColors);
        shuffleColors(colors);
        reverseColors(colors);
        java.util.ArrayList<String> portion = extractPortion(colors, 1, 3);
        System.out.println("Extracted portion: " + portion);
        java.util.ArrayList<String> anotherColors = new java.util.ArrayList<>();
        anotherColors.add("Red");
        anotherColors.add("Green");
        anotherColors.add("Blue");
        anotherColors.add("Yellow");
        compareLists(colors, anotherColors);
        swapElements(colors, 0, 2);
        java.util.ArrayList<String> joinedList = joinLists(colors, anotherColors);
        System.out.println("Joined list: " + joinedList);
        java.util.ArrayList<String> clonedList = cloneList(colors);
        System.out.println("Cloned list: " + clonedList);
        emptyList(colors);
        isListEmpty(colors);
        trimCapacity(colors);
        increaseSize(colors, 5);
        System.out.println("Final colors list: " + colors);
    }
    //2. Write a Java program to iterate through all elements in a array list.
    public static void iterateColors(java.util.ArrayList<String> colors) {
        System.out.println("Iterating through colors:");
        for (String color : colors) {
            System.out.println(color);
        }
    }
    //3.Write a Java program to insert an element into the array list at the first position.
    public static void insertFirst(java.util.ArrayList<String> colors, String color) {
        colors.add(0, color);
        System.out.println("After inserting " + color + " at the first position: " + colors);
    }
    //4. Write a Java program to retrieve an element (at a specified index) from a given array list.
    public static String retrieveElement(java.util.ArrayList<String> colors, int index) {
        if (index >= 0 && index < colors.size()) {
            return "Element at index " + index + ": " + colors.get(index);
        } else {
            return "Index out of bounds";
        }
    }
    //5. Write a Java program to update specific array element by given element.
    public static void updateElement(java.util.ArrayList<String> colors, int index, String newColor) {
        if (index >= 0 && index < colors.size()) {
            colors.set(index, newColor);
            System.out.println("After updating index " + index + " to " + newColor + ": " + colors);
        } else {
            System.out.println("Index out of bounds");
        }
    }
    //6. Write a Java program to remove the third element from a array list.
    public static void removeThirdElement(java.util.ArrayList<String> colors) {
        if (colors.size() >= 3) {
            colors.remove(2); // Index 2 is the third element
            System.out.println("After removing the third element: " + colors);
        } else {
            System.out.println("Not enough elements to remove the third one");
        }
    }
    //7. Write a Java program to search an element in a array list.
    public static boolean searchElement(java.util.ArrayList<String> colors, String color) {
        boolean found = colors.contains(color);
        if (found) {
            System.out.println(color + " is found in the list.");
        } else {
            System.out.println(color + " is not found in the list.");
        }
        return found;
    }
    //8. Write a Java program to sort a given array list.
    public static void sortColors(java.util.ArrayList<String> colors) {
        java.util.Collections.sort(colors);
        System.out.println("Sorted colors: " + colors);
    }
    //9. Write a Java program to copy one array list into another.
    public static java.util.ArrayList<String> copyColors(java.util.ArrayList<String> colors) {
        java.util.ArrayList<String> copiedColors = new java.util.ArrayList<>(colors);
        System.out.println("Copied colors: " + copiedColors);
        return copiedColors;
    }
    //10. Write a Java program to shuffle elements in a array list.
    public static void shuffleColors(java.util.ArrayList<String> colors) {
        java.util.Collections.shuffle(colors);
        System.out.println("Shuffled colors: " + colors);
    }
    //11. Write a Java program to reverse elements in a array list.
    public static void reverseColors(java.util.ArrayList<String> colors) {
        java.util.Collections.reverse(colors);
        System.out.println("Reversed colors: " + colors);
    }
    //12. Write a Java program to extract a portion of a array list.
    public static java.util.ArrayList<String> extractPortion(java.util.ArrayList<String> colors, int start, int end) {
        if (start < 0 || end > colors.size() || start >= end) {
            System.out.println("Invalid start or end index");
            return new java.util.ArrayList<>();
        }
        java.util.ArrayList<String> portion = new java.util.ArrayList<>(colors.subList(start, end));
        System.out.println("Extracted portion from index " + start + " to " + end + ": " + portion);
        return portion;
    }
    //13. Write a Java program to compare two array lists.
    public static boolean compareLists(java.util.ArrayList<String> list1, java.util.ArrayList<String> list2) {
        boolean areEqual = list1.equals(list2);
        if (areEqual) {
            System.out.println("The two lists are equal.");
        } else {
            System.out.println("The two lists are not equal.");
        }
        return areEqual;
    }
    //14. Write a Java program of swap two elements in an array list.
    public static void swapElements(java.util.ArrayList<String> colors, int index1, int index2) {
        if (index1 >= 0 && index1 < colors.size() && index2 >= 0 && index2 < colors.size()) {
            String temp = colors.get(index1);
            colors.set(index1, colors.get(index2));
            colors.set(index2, temp);
            System.out.println("After swapping elements at indices " + index1 + " and " + index2 + ": " + colors);
        } else {
            System.out.println("Invalid indices for swapping");
        }
    }
    //15. Write a Java program to join two array lists.
    public static java.util.ArrayList<String> joinLists(java.util.ArrayList<String> list1, java.util.ArrayList<String> list2) {
        java.util.ArrayList<String> joinedList = new java.util.ArrayList<>(list1);
        joinedList.addAll(list2);
        System.out.println("Joined list: " + joinedList);
        return joinedList;
    }
    //16. Write a Java program to clone an array list to another array list.
    public static java.util.ArrayList<String> cloneList(java.util.ArrayList<String> colors) {
        java.util.ArrayList<String> clonedList = (java.util.ArrayList<String>) colors.clone();
        System.out.println("Cloned list: " + clonedList);
        return clonedList;
    }
    //17. Write a Java program to empty an array list.
    public static void emptyList(java.util.ArrayList<String> colors) {
        colors.clear();
        System.out.println("After emptying the list: " + colors);
    }
    //18. Write a Java program to test an array list is empty or not.
    public static boolean isListEmpty(java.util.ArrayList<String> colors) {
        boolean empty = colors.isEmpty();
        if (empty) {
            System.out.println("The list is empty.");
        } else {
            System.out.println("The list is not empty.");
        }
        return empty;
    }
    //19. Write a Java program to trim the capacity of an array list the current list size.
    public static void trimCapacity(java.util.ArrayList<String> colors) {
        colors.trimToSize();
        System.out.println("After trimming the capacity: " + colors);
    }
    //20. Write a Java program to increase the size of an array list.
    public static void increaseSize(java.util.ArrayList<String> colors, int additionalSize) {
        for (int i = 0; i < additionalSize; i++) {
            colors.add("NewColor" + (colors.size() + 1));
        }
        System.out.println("After increasing the size by " + additionalSize + ": " + colors);
    }

}
