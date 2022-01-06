package com.BridgeLabz.AlgorithmProgram;

import java.util.Scanner;

public class GenericBinarySearch {


    public <K extends Comparable<K>> K binarySearch(K[] array, int low, int high, K data) {
        int mid = (low + high) / 2;
        if (data.equals(array[mid])) {
            System.out.println(data + " , is present in the sentence ");
            return data;
        }
        if (mid == low || mid == high) {
            System.out.println(data + " , not found  ");
            return data;
        } else if (data.compareTo(array[mid]) > 0) {
            binarySearch(array, mid, high, data);
        } else {
            binarySearch(array, low, mid, data);
        }
        return data;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = "hello, welcome to generic binary search";
        String[] arrayOfString = sentence.toLowerCase().split(",");
        GenericBinarySearch binary = new GenericBinarySearch();

        for (int i = 0; i < arrayOfString.length - 1; i++) {
            for (int j = i + 1; j < arrayOfString.length; j++) {
                if (arrayOfString[i].compareTo(arrayOfString[j]) > 0) {
                    String temp = arrayOfString[i];
                    arrayOfString[i] = arrayOfString[j];
                    arrayOfString[j] = temp;
                }
            }
        }
        System.out.println("Enter word to search");
        String word = sc.next();
        binary.binarySearch(arrayOfString, 0, arrayOfString.length, word);
    }
}