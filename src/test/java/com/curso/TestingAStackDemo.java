package com.curso;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.EmptyStackException;
import java.util.Stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@DisplayName("A stack")
public class TestingAStackDemo {
 
    Stack<Object> stack;
 
    @Test
    void is_instantiated_with_new() {
        new Stack<>();
    }
 
    @Nested
    class WhenNew {
 
        @BeforeEach
        void create_new_stack() {
            stack = new Stack<>();
        }
 
        @Test
        void is_empty() {
            assertTrue(stack.isEmpty());
        }
 
        @Test
        void throws_exception_when_popped() {
            assertThrows(EmptyStackException.class, () -> stack.pop());
        }
 
        @Test
        void throws_exception_when_peeked() {
            assertThrows(EmptyStackException.class, () -> stack.peek());
        }
 
        @Nested
        class AfterPushingAnElement {
 
            String anElement = "an element";
 
            @BeforeEach
            void pushAnElement() {
                stack.push(anElement);
            }
 
            @Test
            void is_is_no_longer_empty() {
                assertFalse(stack.isEmpty());
            }
 
            @Test
            void return_element_when_popped_and_is_empty() {
                assertEquals(anElement, stack.pop());
                assertTrue(stack.isEmpty());
            }
 
            @Test
            void return_element_when_peeked_but_remains_not_empty() {
                assertEquals(anElement, stack.peek());
                assertFalse(stack.isEmpty());
            }
        }
    }
}
