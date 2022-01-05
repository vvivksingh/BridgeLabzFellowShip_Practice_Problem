package com.BridgeLabz.Day14.Stacks_Queue;

public interface INode <K> {
    K getKey();
    void setKey(K key);

    INode getNext();
    void setNext(INode next);
}
