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

    public void insertAtLast(T data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public Node<T> insertAtMiddle(T data, int position) {
        Node<T> newNode = new Node<T>(data);
        newNode.data = data;
        Node current = head;
        Node previous = null;
        int i = 0;
        while(i < position) {
            previous = current;
            current = current.next;
            i++;
        }
        newNode.next = current;

        if(previous != null) {
            previous.next = newNode;
            return head;
        }
        return newNode;
    }

    public void popFirstElement() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        else {
            if (head != tail) {
                head = head.next;
            }
            else {
                head = tail = null;
            }
        }
    }

    public void popLastElement() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        else {
            if (head != tail) {
                Node<T> current = head;
                while(current.next != tail) {
                    current = current.next;
                }
                tail = current;
                tail.next = null;
            }
            else {
                head = tail = null;
            }
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
