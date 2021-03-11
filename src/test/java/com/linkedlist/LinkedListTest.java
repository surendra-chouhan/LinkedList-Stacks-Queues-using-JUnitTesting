package com.linkedlist;

import org.junit.Before;
import org.junit.Test;

public class LinkedListTest {
    LinkedList list;

    @Before
    public void set() {
        list = new LinkedList();
    }

    @Test
    public void creating_A_Simple_Linked_List() {
        list.addNode(56);
        list.addNode(30);
        list.addNode(70);
        list.show();
    }
}
