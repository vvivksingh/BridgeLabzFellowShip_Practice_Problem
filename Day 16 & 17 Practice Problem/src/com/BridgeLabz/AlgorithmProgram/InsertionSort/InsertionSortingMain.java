package com.BridgeLabz.AlgorithmProgram.InsertionSort;

import java.util.ArrayList;
import java.util.Scanner;

public class InsertionSortingMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //read data from the file
        ReadingFile read = new ReadingFile();
        ArrayList<String> dataArray = read.readFile();

        //convert the arraylist into array to pass it to the generic class
        String[] array = new String[dataArray.size()];
        array = dataArray.toArray(array);

        //call the insertion sort method
        InsertionSorting insertionSort = new InsertionSorting(array);
        insertionSort.sort();
    }
}
