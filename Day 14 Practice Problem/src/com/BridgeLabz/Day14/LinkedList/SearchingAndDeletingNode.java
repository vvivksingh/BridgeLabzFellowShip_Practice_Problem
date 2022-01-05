package com.BridgeLabz.Day14.LinkedList;

public class SearchingAndDeletingNode {
    public ListNode head;

    public static class ListNode {
        public int data;
        public ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
        //Main Method
        public static void main(String[] args) {
            SearchingAndDeletingNode lists = new SearchingAndDeletingNode();

            lists.head = new ListNode(50);
//            lists.head.next = new ListNode(70);
//            lists.head.next.next = new ListNode(30);
            ListNode secondNode = new ListNode(70);
            ListNode thirdNode = new ListNode(30);
            lists.head.next = secondNode;
            secondNode.next = thirdNode;
            System.out.println("Actual list.");
            lists.print();
            search(lists, 30);
            lists.insert(40, 30);
            lists.print();
            lists.delete(40);
            System.out.println("New List after deletion ");
            lists.print();
        }

        private static void search(SearchingAndDeletingNode lists, int data) {
            ListNode currentNode = lists.head, previousNode = null;
            while (currentNode != null && currentNode.data != data) {

                currentNode = currentNode.next;
            }
            System.out.println("Node found with value 30 : " + currentNode.data);
        }

    }

    private void delete(int whatToDelete) {
        ListNode currentNode = head, previousNode = null;
        while (currentNode != null && currentNode.data != whatToDelete) {
            previousNode = currentNode;
            currentNode = currentNode.next;

        }
        if (currentNode != null) {
            System.out.println(whatToDelete + " node deleted successfully. ");
            previousNode.next = currentNode.next;
        }
    }

    private void insert(int whatToInsert, int afterWhatToInsert) {
        ListNode currentNode = head;
        while (currentNode != null && currentNode.data != afterWhatToInsert) {
            currentNode = currentNode.next;
        }
        currentNode.next = new ListNode(40);
        System.out.println("40 added after 30");
        System.out.println("New List after addition : ");
    }

    private void pop(ListNode node, SearchingAndDeletingNode lists) {
        ListNode newNode = head;
        System.out.println("After removing head node from link list.");

    }

    private void print() {
        ListNode pointer = head;
        while (pointer != null) {
            System.out.print(pointer.data + "->");
            pointer = pointer.next;

        }
        System.out.println("null");
    }
}
