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

    @Test
    public void popQueue_delete_Element_at_First() {
        int i = 0;
        queue.push(56);
        queue.push(30);
        queue.push(70);

        System.out.println("After Deleting in Queue");
        while (i < 3){
            queue.pop();
            i++;
        }
    }
}
