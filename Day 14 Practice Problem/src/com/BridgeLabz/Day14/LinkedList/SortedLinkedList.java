package com.BridgeLabz.Day14.LinkedList;

public class SortedLinkedList {

    Node head = null;

    public void insertAtHead(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        displayLinkedList();
    }

    public void insert(int value) {
        Node newNode = new Node(value);

        Node prevNode = head;
        Node currentNode = head;

        if (head == null) {
            insertAtHead(value);
            return;
        }

        while(currentNode != null) {
            if (newNode.compareTo(currentNode) < 0) {
                newNode.next = currentNode;

                if(currentNode.compareTo(head) == 0)
                    head = newNode;
                else
                    prevNode.next = newNode;

                displayLinkedList();
                return;
            }

            prevNode = currentNode;
            currentNode = currentNode.next;
        }

        prevNode.next = newNode;
        displayLinkedList();

    }

    public void displayLinkedList() {
        Node currentNode = head;

        while(currentNode != null) {
            System.out.print(" " + currentNode.data);
            currentNode = currentNode.next;
        }

        System.out.println();
    }
}