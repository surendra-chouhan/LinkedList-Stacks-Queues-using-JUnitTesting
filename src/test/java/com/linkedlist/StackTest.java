package com.linkedlist;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StackTest {
    Stack stack;

    @Before
    public void set() {
        stack = new Stack();
    }

    @Test
    public void pushStack_add_Element_at_Front() {
        stack.push(70);
        stack.push(30);
        stack.push(56);

        boolean result = stack.getHead().equals(56) &&
                stack.getTail().equals(70);
        Assert.assertTrue(result);
    }

    @Test
    public void popStack_delete_Element_at_Front() {
        int i = 0;
        stack.push(70);
        stack.push(30);
        stack.push(56);

        System.out.println("After Deleting in Stack");
        stack.pop();

        boolean result = stack.getHead().equals(30) &&
                stack.getTail().equals(70);
        Assert.assertTrue(result);
    }
}
