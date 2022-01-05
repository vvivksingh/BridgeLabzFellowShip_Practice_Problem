package com.BridgeLabz.Day14.LinkedList;

public class LListUC6 extends LListUC5{
    //Use case 6 deleting last node

    static void popLast() {
        if (head == null || head.next == null) {
            return ;
        }
        Node currNode = head;
        while (currNode.next.next != null) {
            currNode = currNode.next;
        }
        currNode.next = null;

    }

    public static void main(String[] args) {
        LListUC6 l6 = new LListUC6();
        addToList(56);
        addToList(30);
        addToList(70);
        System.out.println("List before deleting");
        printList();
        System.out.println("List after deleting");
        popLast();
        printList();
    }

}
