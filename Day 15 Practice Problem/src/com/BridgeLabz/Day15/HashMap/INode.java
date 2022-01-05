package com.BridgeLabz.Day15.HashMap;

public interface INode <K>{
    public K getKey();
    public void setKey(K key);
    public INode<K> getNext();
    public void setNext(INode<K> myNode);
}