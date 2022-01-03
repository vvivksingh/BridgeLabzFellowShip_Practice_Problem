package com.BridgeLabz.Day14.LinkedList;
import java.util.LinkedList;
public class LL {
    /*
    Use Case 1
    */
    // declaring type of head
    Node head;
    //
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    //function to add element
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
    }
    //printing element of linked list
    public void printList(){
        if (head == null){
            System.out.println("List is empty ");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst(70);
        list.addFirst(30);
        list.addFirst(56);
        list.printList();
    }
}
