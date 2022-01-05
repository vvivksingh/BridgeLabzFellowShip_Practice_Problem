package com.BridgeLabz.Day14.LinkedList;

public class LListSearchUC7 {
    public Node head;

    public static class Node {
        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

        public static void main(String[] args) {
            LListSearchUC7 lists = new LListSearchUC7();

            lists.head = new Node(56);
            Node secondNode = new Node(70);
            Node thirdNode = new Node(30);
            lists.head.next = secondNode;
            secondNode.next = thirdNode;
            System.out.println("List :" );
            lists.print();
            search(lists, 30);
        }

        private static void search(LListSearchUC7 lists, int data) {
            Node currentNode = lists.head, previousNode = null;

            while (currentNode != null && currentNode.data != data) {

                currentNode = currentNode.next;
            }
            System.out.println("node is found with data 30 : " + currentNode.data);
        }

    }



    private void print() {
        Node pointer = head;
        while (pointer != null) {
            System.out.print(pointer.data + "->");
            pointer = pointer.next;
        }
        System.out.println("null");
    }
}
