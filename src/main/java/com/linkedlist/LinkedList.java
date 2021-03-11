package com.linkedlist;

public class LinkedList<T extends Comparable<T>> {

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

    public void insertAtFirst(T data) {
        Node newNode1 = new Node(data);
        if(head == null) {
            head = newNode1;
            tail = newNode1;
        }
        else {
            Node node1 = head;
            head = newNode1;
            head.next = node1;
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
