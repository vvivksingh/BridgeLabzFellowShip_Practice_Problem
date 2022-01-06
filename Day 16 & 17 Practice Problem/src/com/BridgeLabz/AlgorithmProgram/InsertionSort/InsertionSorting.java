package com.BridgeLabz.AlgorithmProgram.InsertionSort;

public class InsertionSorting<T extends Comparable<T>> {
    T[] elements;

    public InsertionSorting(T[] elements) {
        this.elements = elements;
    }

    public void sort() {
        int length = elements.length;

        System.out.print("Before sorting: \n");
        for(int i = 0; i < length; i++) {
            System.out.print(elements[i] +",");
        }
        System.out.println();

        for( int i = 1; i < length; i++) {
            //consider a pivot element
            T key = elements[i];
            int j = i-1;

            //move the elements that are greater than key, one position ahead of the current position
            while(j > 0 && elements[j].compareTo(key) > 0) {
                elements[j+1] = elements[j];
                j--;
            }
            elements[j+1] = key;
        }
        printSortedArray();
    }
    public void printSortedArray() {
        System.out.print("After sorting: \n");
        for(int i = 0; i < elements.length; i++)
            System.out.print(elements[i]+",");
    }
}
