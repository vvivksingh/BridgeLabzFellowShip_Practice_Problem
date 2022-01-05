package com.BridgeLabz.Day14.LinkedList;

//Use Case 4 inserting element in between
public class LListUC4{
    static Node head;
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void printList() {
        Node currNode = head;
        System.out.print("LinkedList: ");
        while (currNode != null) {
            System.out.print(currNode.data + "-->");
            currNode = currNode.next;
        }
        System.out.println(currNode);
    }

    public static void insertInBetween(int position, int data) {
        Node currentNode = head;
        Node newNode = new Node(data);

        while (currentNode.data != position) {
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
        newNode.next = currentNode.next;
        currentNode.next = newNode;
    }

    public static void addToList(int data) {
        Node newNode = new Node(data);
        newNode.next = null;

        if (head == null)
            head = newNode;
        else {
            Node currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
    }

    public static void main(String[] args) {
        addToList(56);
        addToList(70);
        printList();
        insertInBetween(56, 30);
        printList();
    }
}

