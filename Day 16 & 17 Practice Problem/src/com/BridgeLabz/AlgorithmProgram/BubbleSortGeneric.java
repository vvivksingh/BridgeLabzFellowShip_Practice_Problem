package com.BridgeLabz.AlgorithmProgram;

public class BubbleSortGeneric {

    public <K extends Comparable<K>> K bubbleSort(K[] array) {
        K temp = null;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        BubbleSortGeneric sort = new BubbleSortGeneric();
        String sentence = "Hello, Welcome to bubble sort generic method";
        String array[] = sentence.toLowerCase().split(",");
        sort.bubbleSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
