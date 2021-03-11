package com.linkedlist;

public class LinkedList<T extends Comparable> {

    class Node<T> {
        T data;
        Node next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head = null;
    public Node tail = null;

    public void addNode(T data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void show() {
        Node<T> current = head;
        int size = 0;

        if(head == null) {
            System.out.println("List is Empty");
            return;
        }
        System.out.println("Values in list are : ");
        while(current != null) {
            System.out.println(current.data + " ");
            size++;
            current = current.next;
        }
        System.out.println("List Size is : " + size);
    }
}
