package com.linkedlist;

import org.junit.Before;
import org.junit.Test;

public class StackTest {
    Stack stack;

    @Before
    public void set() {
        stack = new Stack();
    }

    @Test
    public void pushStack_add_Element_at_Tail() {
        stack.push(56);
        stack.push(30);
        stack.push(70);
    }
}
