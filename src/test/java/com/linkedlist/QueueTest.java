package com.linkedlist;

import org.junit.Assert;
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

        boolean result = queue.getHead().equals(56) &&
                queue.getTail().equals(70);
        Assert.assertTrue(result);
    }

    @Test
    public void popQueue_delete_Element_at_First() {
        int i = 0;
        queue.push(56);
        queue.push(30);
        queue.push(70);

        System.out.println("After Deleting in Queue");
        queue.pop();

        boolean result = queue.getHead().equals(30) &&
                queue.getTail().equals(70);
        Assert.assertTrue(result);
    }
}
