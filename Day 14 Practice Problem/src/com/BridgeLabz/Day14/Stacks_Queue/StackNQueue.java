package com.BridgeLabz.Day14.Stacks_Queue;

public class StackNQueue {
    /*
    Use case 1: create a stack by pushing some elements
    */
    public static MyLinkedList pushToStack(MyLinkedList myLinkedList,Integer ...args){
        // create node and add them to the linked list
        for (int num:args){
            Node<Integer> myNode1 = new Node<>(num);
            myLinkedList.addElement(myNode1);
        }
        myLinkedList.printNodes();
        return myLinkedList;
    }
    /*
    Use case 2: Peek into the stack and pop till it is empty
    */
    public static void peekPopFromStack(MyLinkedList myLinkedList){
        // Print the nodes of present linked list
        myLinkedList.printNodes();
        // pop from stack till empty
        while (myLinkedList.peekInto()){
            myLinkedList.popElement();
            myLinkedList.printNodes();
        }
    }
    /*
    Use case 3: create a queue by enqueuing new elements into the queue
    */
    public static void enqueueOp(MyLinkedList myLinkedList, Integer ...args){
        for (Integer num:args){
            Node <Integer> myNode = new Node<>(num);
            myLinkedList.append(myNode);
            myLinkedList.printNodes();
        }
    }
    /*
    Use case 4: Dequeue elements from the queue
    */
    public static void dequeueOp(MyLinkedList myLinkedList){
        myLinkedList.popElement();
        myLinkedList.printNodes();
    }
    public static void main(String []args){
        MyLinkedList myLinkedList = new MyLinkedList();
        enqueueOp(myLinkedList,56,30,70);
        dequeueOp(myLinkedList);
        dequeueOp(myLinkedList);
        dequeueOp(myLinkedList);
    }
}
