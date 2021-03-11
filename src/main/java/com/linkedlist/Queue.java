package com.linkedlist;

public class Queue<T extends Comparable> {
    LinkedList Queue = new LinkedList();

    public void push(T value){
        this.Queue.insertAtLast(value);
        this.Queue.show();
    }

    public void pop(){
        this.Queue.popFirstElement();
        this.Queue.show();
    }
}
