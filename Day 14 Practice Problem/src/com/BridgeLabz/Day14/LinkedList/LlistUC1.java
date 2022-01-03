package com.BridgeLabz.Day14.LinkedList;

import java.util.LinkedList;

public class LlistUC1 {

    public static void main(String[] args) {
        //Use Case 1
        LinkedList<Integer> l1 = new LinkedList<>();
        l1.addFirst(56);
        l1.add(1, 30);
        l1.addLast(70);
        for (int i = 0; i < l1.size(); i++) {
            System.out.print(l1.get(i) + " ->");
            System.out.print("NULL");
        }
    }
}


