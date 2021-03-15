package com.linkedlist;

public class Stack<T extends Comparable> {
    LinkedList Stack = new LinkedList();

    public Object getHead(){
        return Stack.head.getKey();
    }

    public Object getTail(){
        return Stack.tail.getKey();
    }

    public void push(T value){
        Stack.insertAtFirst(value);
        Stack.show();
    }

    public void pop() {
        Stack.popFirstElement();
        Stack.show();
    }
}
