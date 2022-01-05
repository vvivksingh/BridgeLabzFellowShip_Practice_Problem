package com.BridgeLabz.Day14.LinkedList;

public class LlistUC3 extends LlistUC2{

    //Use Case 3
    public void addLast(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public static void main(String[] args) {
        LlistUC3 l2 = new LlistUC3();
        l2.addFirst(56);
        l2.printList();
        l2.addLast(30);
        l2.printList();
        l2.addLast(70);
        l2.printList();
    }
}
