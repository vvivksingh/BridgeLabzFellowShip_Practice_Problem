package com.BridgeLabz.Day14.Stacks_Queue;

public class Node <K> implements INode <K>{
    private K key;
    private INode next;

    public Node(K key){
        this.key = key;
        this.next = null;
    }
    // Getter and Setter
    @Override
    public K getKey(){
        return key;
    }
    @Override
    public void setKey(K key){
        this.key = key;
    }
    @Override
    public INode <K> getNext(){
        return next;
    }
    @Override
    public void setNext(INode next){
        this.next = (Node <K>) next;
    }
}
