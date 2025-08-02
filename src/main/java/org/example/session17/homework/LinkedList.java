package org.example.session17.homework;

public class LinkedList {
    public static void main(String[] args) {

    }

    private static void appendElement(java.util.LinkedList<String> linkedList, String yellow) {
    }

    //2.Write a Java program to iterate through all elements in a linked list.
    public static void iterateLinkedList(java.util.LinkedList<String> linkedList) {
        System.out.println("Iterating through linked list:");
        for (String color : linkedList) {
            System.out.println(color);
        }
    }
    // 3.Write a Java program to iterate through all elements in a linked list starting at the specified position.
    public static void iterateFromPosition(java.util.LinkedList<String> linkedList, int position) {
        System.out.println("Iterating from position " + position + ":");
        for (int i = position; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }
    }
    // 4.Write a Java program to iterate a linked list in reverse order.
    public static void iterateReverse(java.util.LinkedList<String> linkedList) {
        System.out.println("Iterating in reverse order:");
        for (int i = linkedList.size() - 1; i >= 0; i--) {
            System.out.println(linkedList.get(i));
        }
    }
    // 5.Write a Java program to insert the specified element at the specified position in the linked list.
    public static void insertAtPosition(java.util.LinkedList<String> linkedList, String element, int position) {
        if (position >= 0 && position <= linkedList.size()) {
            linkedList.add(position, element);
            System.out.println("Linked List after inserting " + element + " at position " + position + ": " + linkedList);
        } else {
            System.out.println("Invalid position: " + position);
        }
    }
    // 6.Write a Java program to insert elements into the linked list at the first and last position.
    public static void insertFirstAndLast(java.util.LinkedList<String> linkedList, String firstElement, String lastElement) {
        linkedList.addFirst(firstElement);
        linkedList.addLast(lastElement);
        System.out.println("Linked List after inserting " + firstElement + " at the front and " + lastElement + " at the end: " + linkedList);
    }
    // 7.Write a Java program to insert the specified element at the front of a linked list.
    public static void insertAtFront(java.util.LinkedList<String> linkedList, String element) {
        linkedList.addFirst(element);
        System.out.println("Linked List after inserting " + element + " at the front: " + linkedList);
    }
    // 8.Write a Java program to insert the specified element at the end of a linked list.
    public static void insertAtEnd(java.util.LinkedList<String> linkedList, String element) {
        linkedList.addLast(element);
        System.out.println("Linked List after inserting " + element + " at the end: " + linkedList);
    }
    // 9.Write a Java program to insert some elements at the specified position into a linked list.
    public static void insertMultipleAtPosition(java.util.LinkedList<String> linkedList, java.util.List<String> elements, int position) {
        if (position >= 0 && position <= linkedList.size()) {
            linkedList.addAll(position, elements);
            System.out.println("Linked List after inserting elements " + elements + " at position " + position + ": " + linkedList);
        } else {
            System.out.println("Invalid position: " + position);
        }
    }
    // 10.Write a Java program to get the first and last occurrence of the specified elements in a linked list.
    public static void getFirstAndLastOccurrence(java.util.LinkedList<String> linkedList, String element) {
        int firstIndex = linkedList.indexOf(element);
        int lastIndex = linkedList.lastIndexOf(element);
        if (firstIndex != -1) {
            System.out.println("First occurrence of " + element + " is at index: " + firstIndex);
        } else {
            System.out.println(element + " not found in the list.");
        }
        if (lastIndex != -1) {
            System.out.println("Last occurrence of " + element + " is at index: " + lastIndex);
        } else {
            System.out.println(element + " not found in the list.");
        }
    }
    // 11.Write a Java program to display the elements and their positions in a linked list.
    public static void displayElementsWithPositions(java.util.LinkedList<String> linkedList) {
        System.out.println("Elements and their positions in the linked list:");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println("Position " + i + ": " + linkedList.get(i));
        }
    }
    // 12.Write a Java program to remove a specified element from a linked list.
    public static void removeElement(java.util.LinkedList<String> linkedList, String element) {
        boolean removed = linkedList.remove(element);
        if (removed) {
            System.out.println("Linked List after removing " + element + ": " + linkedList);
        } else {
            System.out.println(element + " not found in the list.");
        }
    }
    // 13.Write a Java program to remove first and last element from a linked list.
    public static void removeFirstAndLast(java.util.LinkedList<String> linkedList) {
        if (!linkedList.isEmpty()) {
            String firstElement = linkedList.removeFirst();
            String lastElement = linkedList.removeLast();
            System.out.println("Removed first element: " + firstElement);
            System.out.println("Removed last element: " + lastElement);
            System.out.println("Linked List after removal: " + linkedList);
        } else {
            System.out.println("The linked list is empty.");
        }
    }
    //14.Write a Java program to remove all the elements from a linked list.
    public static void removeAllElements(java.util.LinkedList<String> linkedList) {
        linkedList.clear();
        System.out.println("Linked List after removing all elements: " + linkedList);
    }
    //15.Write a Java program of swap two elements in a linked list.
    public static void swapElements(java.util.LinkedList<String> linkedList, int index1, int index2) {
        if (index1 >= 0 && index1 < linkedList.size() && index2 >= 0 && index2 < linkedList.size()) {
            String temp = linkedList.get(index1);
            linkedList.set(index1, linkedList.get(index2));
            linkedList.set(index2, temp);
            System.out.println("Linked List after swapping elements at indices " + index1 + " and " + index2 + ": " + linkedList);
        } else {
            System.out.println("Invalid indices for swapping: " + index1 + ", " + index2);
        }
    }
    //16.Write a Java program to shuffle the elements in a linked list.
    public static void shuffleLinkedList(java.util.LinkedList<String> linkedList) {
        java.util.Collections.shuffle(linkedList);
        System.out.println("Linked List after shuffling: " + linkedList);
    }
    //17.Write a Java program to join two linked lists.
    public static java.util.LinkedList<String> joinLinkedLists(java.util.LinkedList<String> list1, java.util.LinkedList<String> list2) {
        java.util.LinkedList<String> joinedList = new java.util.LinkedList<>(list1);
        joinedList.addAll(list2);
        System.out.println("Joined Linked List: " + joinedList);
        return joinedList;
    }
    //18.Write a Java program to clone an linked list to another linked list.
    public static java.util.LinkedList<String> cloneLinkedList(java.util.LinkedList<String> linkedList) {
        java.util.LinkedList<String> clonedList = (java.util.LinkedList<String>) linkedList.clone();
        System.out.println("Cloned Linked List: " + clonedList);
        return clonedList;
    }
    //19.Write a Java program to remove and return the first element of a linked list.
    public static String removeFirstElement(java.util.LinkedList<String> linkedList) {
        if (!linkedList.isEmpty()) {
            String firstElement = linkedList.removeFirst();
            System.out.println("Removed first element: " + firstElement);
            return firstElement;
        } else {
            System.out.println("The linked list is empty.");
            return null;
        }
    }
    //20.Write a Java program to retrieve but does not remove, the first element of a linked list.
    public static String getFirstElement(java.util.LinkedList<String> linkedList) {
        if (!linkedList.isEmpty()) {
            String firstElement = linkedList.getFirst();
            System.out.println("First element: " + firstElement);
            return firstElement;
        } else {
            System.out.println("The linked list is empty.");
            return null;
        }
    }
}
