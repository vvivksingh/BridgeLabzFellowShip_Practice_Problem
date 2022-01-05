package com.BridgeLabz.Day15.HashMap;

public class MyMapNode<K,V> implements INode<K>{
    K key;
    V value;
    MyMapNode<K,V> next;
    public MyMapNode(K key, V value){
        this.key = key;
        this.value = value;
        next = null;
    }
    // Getter and setter
    @Override
    public K getKey(){
        return key;
    }
    @Override
    public void setKey(K key){
        this.key = key;
    }
    public V getValue(){
        return this.value;
    }
    public void setValue(V value){
        this.value = value;
    }
    @Override
    public INode<K> getNext(){
        return next;
    }
    @Override
    public void setNext(INode <K> next){
        this.next = (MyMapNode<K,V>) next;  // typecasting
    }
    @Override
    public String toString(){
        StringBuilder myMapNodeString = new StringBuilder();
        myMapNodeString.append("MyMapNode{" +"K=").append(key).append(" V=")
                .append(value).append('}');
        if (next != null){
            myMapNodeString.append("->").append(next);
        }
        return myMapNodeString.toString();
    }
}
