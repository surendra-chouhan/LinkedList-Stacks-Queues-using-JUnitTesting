package com.linkedlist;

public class Queue<T extends Comparable> {
    LinkedList Queue = new LinkedList();

    public Object getHead(){
        return Queue.head.getKey();
    }

    public Object getTail(){
        return Queue.tail.getKey();
    }

    public void push(T value){
        Queue.insertAtLast(value);
        Queue.show();
    }

    public void pop(){
        Queue.popFirstElement();
        Queue.show();
    }
}
