package com.linkedlist;

class Node<T> {
    T data;
    Node next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }

    public T getKey() {
        return data;
    }

    public void setKey(T data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = (Node) next;
    }
}


public class LinkedList<T extends Comparable<T>> {

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public Node head = null;
    public Node tail = null;

    public void addNode(T data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public T insertAtFirst(T data) {
        Node newNode1 = new Node(data);
        if (head == null) {
            head = newNode1;
            tail = newNode1;
        } else {
            Node node1 = head;
            head = newNode1;
            head.next = node1;
        }
        return (T) head.data;
    }

    public T insertAtLast(T data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        return (T) tail.data;
    }

    public Node<T> insertAtMiddle(T data, int position) {
        Node<T> newNode = new Node<T>(data);
        newNode.data = data;
        Node current = head;
        Node previous = null;
        int i = 0;
        while (i < position) {
            previous = current;
            current = current.next;
            i++;
        }
        newNode.next = current;

        if (previous != null) {
            previous.next = newNode;
            return head;
        }
        return newNode;
    }

    public void popFirstElement() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        } else {
            if (head != tail) {
                head = head.next;
            } else {
                head = tail = null;
            }
        }
    }

    public void popLastElement() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        } else {
            if (head != tail) {
                Node<T> current = head;
                while (current.next != tail) {
                    current = current.next;
                }
                tail = current;
                tail.next = null;
            } else {
                head = tail = null;
            }
        }
    }

    public T searchNode(T data) {
        Node<T> current = head;
        int i = 0;
        boolean flag = false;

        if (current == null) {
            System.out.println("List is Empty");
            return null;
        } else {
            while (current != null) {
                if (current.data == data) {
                    flag = true;
                    break;
                } else {
                    flag = false;
                }
                i++;
                current = current.next;
            }

            if (flag) {
                System.out.println(data + " is present in the list at position : " + i);
                return (T) current.data;
            } else {
                System.out.println(data + " is not present in the list");
                return null;
            }
        }
    }

    public T insertAfterGivenNode(Node<T> previous, T data) {
        if (previous == null) {
            System.out.println("Previous Node cannot be null");
            return null;
        }
        Node<T> newNode = new Node<T>(data);
        newNode.next = previous.next;
        previous.next = newNode;
        return (T) newNode.data;
    }

    public T deleteAfterGivenNode(T key) {
        Node<T> temp = head;
        Node<T> previous = null;

        if (temp != head && temp.data == key) {
            head = temp.next;
            return null;
        }

        while (temp != null && temp.data != key) {
            previous = temp;
            temp = temp.next;
        }

        if (temp == null) {
            return null;
        }
        previous.next = temp.next;
        return (T) previous.data;
    }

    public <T> void sortList() {
        Node current = head;
        Node index = null;
        T temp;

        if (head == null) {
            return;
        } else {
            while (current != null) {
                index = current.next;
                while (index != null) {
                    if (((Comparable<T>) current.data).compareTo((T) index.data) > 0) {
                        temp = (T) current.data;
                        current.data = index.data;
                        index.data = temp;
                    }
                    index = index.next;
                }
                current = current.next;
            }
        }
    }

    public T show() {
        Node<T> current = head;
        int size = 0;

        if (head == null) {
            System.out.println("List is Empty");
            return null;
        } else {
            System.out.println("Values in list are : ");
            while (current != null) {
                System.out.println(current.data + " ");
                size++;
                current = current.next;
            }
            return (T) tail.data;
        }
    }
}