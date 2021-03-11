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
        stack.push(70);
        stack.push(30);
        stack.push(56);
    }

    @Test
    public void popStack_delete_Element_at_Front() {
        int i = 0;
        stack.push(70);
        stack.push(30);
        stack.push(56);

        System.out.println("After Deleting in Stack");
        while ( i < 3) {
            stack.pop();
            i++;
        }
    }
}
