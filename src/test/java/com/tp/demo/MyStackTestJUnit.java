package com.tp.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.tp.demo.MyStack;

public class MyStackTestJUnit {

    private MyStack stack;

    @BeforeEach
    public void setUp() {
        stack = new MyStack();
    }

    @Test
    public void testPush() {
        stack.push("A");
        stack.push("B");
        stack.push("C");

        Assertions.assertEquals(3, stack.size());
        Assertions.assertEquals("C", stack.peek());
    }

    @Test
    public void testPop() {
        stack.push("A");
        stack.push("B");
        stack.push("C");

        Assertions.assertEquals("C", stack.pop());
        Assertions.assertEquals(2, stack.size());

        Assertions.assertEquals("B", stack.pop());
        Assertions.assertEquals(1, stack.size());

        Assertions.assertEquals("A", stack.pop());
        Assertions.assertEquals(0, stack.size());

        Assertions.assertNull(stack.pop());
    }

    @Test
    public void testPeek() {
        stack.push("X");
        stack.push("Y");
        stack.push("Z");

        Assertions.assertEquals("Z", stack.peek());
        Assertions.assertEquals(3, stack.size());
    }

    @Test
    public void testEmpty() {
        Assertions.assertTrue(stack.empty());

        stack.push("X");

        Assertions.assertFalse(stack.empty());

        stack.pop();

        Assertions.assertTrue(stack.empty());
    }

    @Test
    public void testSearch() {
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Apple");
        stack.push("Cherry");

        Assertions.assertEquals(3, stack.search("Apple"));
        Assertions.assertEquals(2, stack.search("Banana"));
        Assertions.assertEquals(-1, stack.search("Grape"));
    }

    @Test
    public void testSize() {
        Assertions.assertEquals(0, stack.size());

        stack.push("A");
        stack.push("B");
        stack.push("C");

        Assertions.assertEquals(3, stack.size());

        stack.pop();

        Assertions.assertEquals(2, stack.size());

        stack.pop();
        stack.pop();

        Assertions.assertEquals(0, stack.size());
    }
}


