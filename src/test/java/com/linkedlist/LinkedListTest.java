package com.linkedlist;

import org.junit.Assert;
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

        boolean result = list.head.getKey().equals(56) &&
                list.head.next.getKey().equals(30) &&
                list.tail.getKey().equals(70);
        Assert.assertTrue(result);
    }

    @Test
    public void insert_Element_At_First() {
        list.insertAtFirst(70);
        list.insertAtFirst(30);
        list.insertAtFirst(56);
        list.show();

        boolean result = list.head.getKey().equals(56) &&
                list.head.next.getKey().equals(30) &&
                list.tail.getKey().equals(70);
        Assert.assertTrue(result);
    }

    @Test
    public void insert_Element_At_Last() {
        list.insertAtLast(56);
        list.insertAtLast(30);
        list.insertAtLast(70);
        list.show();

        boolean result = list.head.getKey().equals(56) &&
                list.head.next.getKey().equals(30) &&
                list.tail.getKey().equals(70);
        Assert.assertTrue(result);
    }

    @Test
    public void insert_Element_At_Middle() {
        list.insertAtLast(56);
        list.insertAtLast(70);
        list.insertAtMiddle(30,1);
        list.show();

        boolean result = list.head.getKey().equals(56) &&
                list.head.next.getKey().equals(30) &&
                list.tail.getKey().equals(70);
        Assert.assertTrue(result);
    }

    @Test
    public void pop_First_Element() {
        System.out.println("Before Deleting First Element ");
        list.addNode(56);
        list.addNode(30);
        list.addNode(70);
        list.show();

        System.out.println("After Deleting First Element ");
        list.popFirstElement();
        list.show();

        boolean result = list.head.getKey().equals(30) &&
                list.tail.getKey().equals(70);
        Assert.assertTrue(result);
    }

    @Test
    public void pop_Last_Element() {
        System.out.println("Before Deleting Last Element ");
        list.addNode(56);
        list.addNode(30);
        list.addNode(70);
        list.show();

        System.out.println("After Deleting Last Element ");
        list.popLastElement();
        list.show();

        boolean result = list.head.getKey().equals(56) &&
                list.tail.getKey().equals(30);
        Assert.assertTrue(result);
    }

    @Test
    public void search_Given_Node() {
        list.addNode(56);
        list.addNode(30);
        list.addNode(70);
        list.show();

        int result  = (int)list.searchNode(30);
        Assert.assertEquals(30,result);
    }

    @Test
    public void insert_After_Given_Node() {
        list.addNode(56);
        list.addNode(70);
        list.insertAtMiddle(30,1);
        list.show();

        System.out.println("Inserting Element after 30");
        int result =  (int)list.insertAfterGivenNode(list.head.next,40);
        list.show();
        Assert.assertEquals(40, result);
    }

    @Test
    public void delete_After_Given_Node() {
        list.addNode(56);
        list.addNode(70);
        list.insertAtMiddle(30,1);
        list.show();

        System.out.println("Inserting Element after 30");
        list.insertAfterGivenNode(list.head.next,40);
        list.show();

        System.out.println("After Deleting Element 40 ");
        int result = (int)list.deleteAfterGivenNode(40);
        list.show();
        Assert.assertEquals(30,result);
    }

    @Test
    public void to_Sort_LinkedList_In_Ascending_Order() {
        list.addNode(56);
        list.addNode(70);
        list.insertAtMiddle(30,1);
        list.show();

        System.out.println("Inserting Element after 30");
        list.insertAfterGivenNode(list.head.next,40);
        list.show();

        System.out.println("After Sorting the list is : ");
        list.sortList();
        list.show();

        boolean result = list.head.getKey().equals(30) &&
                list.tail.getKey().equals(70);
        Assert.assertTrue(result);
    }
}
