package com.BridgeLabz.Day15.HashMap;

public class HashMapUC1 {
    /*
    Use Case 1: Find frequency of words in a sentence
    */
    public void findWordFrequency(String sentence){
        MyHashMap<String,Integer> myHashMap = new MyHashMap<>();
        String []words = sentence.toLowerCase().split(" ");

        for (String word: words){
            Integer value = myHashMap.get(word);
            if (value ==null){value = 1;}
            else{ value++;}
            myHashMap.add(word,value);
        }
        int frequency = myHashMap.get("do");
        System.out.println(myHashMap);
    }
    public static void main(String [] args){
        HashMapUC1 mht = new HashMapUC1();
        String sentence = "To Do or not to Do";
        mht.findWordFrequency(sentence);
    }
}
