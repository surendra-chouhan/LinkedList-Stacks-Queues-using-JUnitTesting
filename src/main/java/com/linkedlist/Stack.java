package com.linkedlist;

public class Stack<T extends Comparable> {
    LinkedList Stack = new LinkedList();

    public void push(T value){
        this.Stack.insertAtLast(value);
        this.Stack.show();
    }
}
