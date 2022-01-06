package com.BridgeLabz.AlgorithmProgram.BubbleSort;

import java.util.ArrayList;
import java.util.Scanner;

public class BubbleSortMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //read data from the file
        ReadingFile read = new ReadingFile();
        ArrayList<Integer> dataArray = read.readFile();

        //convert the arraylist into array to pass it to the generic class
        Integer[] array = new Integer[dataArray.size()];
        array = dataArray.toArray(array);

        //call the bubble sort method
        BubbleSorting bubbleSort = new BubbleSorting(array);
        bubbleSort.sort();
    }
}

