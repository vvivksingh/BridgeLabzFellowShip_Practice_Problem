package com.BridgeLabz.Day15.HashMap;

public class MyLinkedList <K>{
    INode head;
    INode tail;
    public void add(INode <K> newNode){
        if (this.tail==null){
            this.tail = newNode;
        }
        if (this.head == null){
            this.head = newNode;
        } else{
            INode <K> tempNode = this.head;
            this.head = tempNode;
            this.head.setNext(tempNode);
        }
    }

    //Append an element to the queue
    public void append(INode myNode){
        INode tempNode;
        if (this.head == null){
            this.head = myNode;
        }
        if (this.tail==null){
            this.tail = myNode;
        }else {
            this.tail.setNext(myNode);
            this.tail = myNode;
        }
    }
    // Search for a given element in the linked list
    public INode search(K key){
        INode<K> tempNode = head;
        int count = 0 ;
        Boolean elem_found = false;
        while (tempNode != null && tempNode.getNext()!= null ){
            if (tempNode.getKey().equals(key)){
                return tempNode;
            }
            tempNode = tempNode.getNext();
        }
        return null;
    }


    // To print the nodes of the linked list
    public void printMyNodes1(){
        INode pres_node = this.head;
        if (pres_node == null){
            System.out.println("It is empty!");
        }else {
            StringBuffer toPrint = new StringBuffer("The Nodes are: ");
            while (pres_node.getNext() != null){
                toPrint.append(pres_node.getKey());
                if (!pres_node.equals(tail)) {
                    toPrint.append("->");
                }
                pres_node = pres_node.getNext();
            }
            toPrint.append(pres_node.getKey());
            System.out.println(toPrint);
        }
    }

    public void printMyNodes(){
        System.out.println("My Nodes: "+head);
    }
    @Override
    public String toString(){
        return "myHashMapNodes{"+ head + '}';
    }
}
