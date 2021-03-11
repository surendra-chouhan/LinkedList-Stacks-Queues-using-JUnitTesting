package com.linkedlist;

import org.junit.Before;
import org.junit.Test;

public class QueueTest {
    Queue queue;

    @Before
    public void set() {
        queue = new Queue();
    }

    @Test
    public void pushQueue_add_Element_at_Tail() {
        queue.push(56);
        queue.push(30);
        queue.push(70);
    }
}
