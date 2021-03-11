package com.linkedlist;

public class Stack<T extends Comparable> {
    LinkedList Stack = new LinkedList();

    public void push(T value){
        this.Stack.insertAtFirst(value);
        this.Stack.show();
    }


    public void pop() {
        this.Stack.popFirstElement();
        this.Stack.show();
    }
}
