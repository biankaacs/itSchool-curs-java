package org.example.session17;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayVsArrayList {
    public static void main(String[] args) {
        int[] array = new int[5]; // Fixed size array
        array[0] = 10;
        array[1] = 20;
        array[2] = 30;

        System.out.println("Array elements:" + Arrays.toString(array));
        for (int i = 0; i < 5; i++) {
            System.out.println("Element at index " + i + ": " + array[i]);
        }
        for (int value : array) {
            System.out.println("Value: " + value);
        }

        ArrayList<Integer> arrayList = new ArrayList<>(); // Dynamic size ArrayList
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        System.out.println("ArrayList elements: " + arrayList);
        System.out.println("value at index 0: " + arrayList.get(1));
        arrayList.add(1, 15); // Insert at index 1
        System.out.println("value at index 1 after insertion: " + arrayList.get(1));
        System.out.println(arrayList);
        arrayList.remove(2); // Remove element at index 2
        System.out.println(arrayList);
    }
}
