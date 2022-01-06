package com.BridgeLabz.AlgorithmProgram.BubbleSort;

public class BubbleSorting<T extends Comparable<T>> {
    T[] elements;

    public BubbleSorting(T[] elements) {
        this.elements = elements;
    }

    public void sort() {
        int length = elements.length;

        System.out.println("Before sorting:");
        for(int i = 0; i < length; i++) {
            System.out.print(elements[i] + ",");
        }
        System.out.println();

        for (int i = 0; i < length-1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (elements[j].compareTo(elements[j + 1]) > 0) {
                    T temp = elements[j];
                    elements[j] = elements[j + 1];
                    elements[j + 1] = temp;
                }
            }
        }
        printSortedArray();
    }

    public void printSortedArray() {
        System.out.println("After sorting: ");
        for(int i = 0; i < elements.length; i++)
            System.out.print(elements[i] + ",");
    }
}
