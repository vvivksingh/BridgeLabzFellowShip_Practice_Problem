package com.BridgeLabz.Day14.LinkedList;

public class LListUC5 extends LListUC4{
    //Use case 5
    public static void pop() {
        Node currentNode = head.next;
        head.next = null;
        head = currentNode;
    }
    public static void main(String[] args) {
        addToList(56);
        addToList(70);
        insertInBetween(56, 30);
        System.out.println("List Before deleting");
        printList();
        pop();
        System.out.println("List after deleting");
        printList();
    }
}
