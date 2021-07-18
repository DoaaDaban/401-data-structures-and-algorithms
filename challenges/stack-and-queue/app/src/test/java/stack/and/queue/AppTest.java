/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package stack.and.queue;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

//    <<< CODE CHALLENGE 10 >>>

    @Test
    public void pushToStackTest(){
        Stack<Integer> stackTest = new Stack<>();
        stackTest.push(11);
        stackTest.push(7);
        stackTest.push(2021);
        assertEquals("Stack { 2021 --> 7 --> 11 --> Null }",stackTest.toString());
    }

    @Test
    public void popStackTest(){
        Stack<Integer> stackTest = new Stack<>();
        stackTest.push(11);
        stackTest.push(7);
        stackTest.push(2021);
        stackTest.pop();
        assertEquals("Stack { 7 --> 11 --> Null }",stackTest.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void emptyStackTest(){
        Stack<Integer> stackTest = new Stack<>();
        stackTest.push(11);
        stackTest.push(7);
        stackTest.push(2021);
        stackTest.pop();
        stackTest.pop();
        stackTest.pop();
        assertEquals("Stack { Null }",stackTest.toString());
        assertTrue(stackTest.isEmpty());
        assertEquals(IllegalArgumentException.class,stackTest.pop());
        assertNull(stackTest.peek());


    }

    @Test
    public void peekStackTest(){
        Stack<Integer> stackTest = new Stack<>();
        stackTest.push(11);
        stackTest.push(7);
        stackTest.push(2021);
        assertEquals(2021,stackTest.peek());
        stackTest.pop();
        assertEquals(7,stackTest.peek());
    }

    @Test
    public void enqueueToQueueTest(){
        Queue<Integer> queueTest = new Queue<>();
        queueTest.enqueue(11);
        queueTest.enqueue(7);
        queueTest.enqueue(2021);
        assertEquals("Queue { 11 --> 7 --> 2021 --> Null }",queueTest.toString());
    }

    @Test
    public void dequeueFromQueueTest(){
        Queue<Integer> queueTest = new Queue<>();
        queueTest.enqueue(11);
        queueTest.enqueue(7);
        queueTest.enqueue(2021);

        queueTest.dequeue();
        assertEquals("Queue { 7 --> 2021 --> Null }",queueTest.toString());
    }
    @Test(expected = IllegalArgumentException.class)
    public void emptyQueueTest(){
        Queue<Integer> queueTest = new Queue<>();
        queueTest.enqueue(11);
        queueTest.enqueue(7);
        queueTest.enqueue(2021);
        queueTest.dequeue();
        queueTest.dequeue();
        queueTest.dequeue();
        assertTrue(queueTest.isEmpty());
        assertEquals("Queue { Null }",queueTest.toString());
        assertEquals( IllegalArgumentException.class,queueTest.dequeue());
        assertNull(queueTest.peek());
    }

    @Test
    public void peekQueueTest(){
        Queue<Integer> queueTest = new Queue<>();
        queueTest.enqueue(11);
        queueTest.enqueue(7);
        queueTest.enqueue(2021);
        assertEquals(11,queueTest.peek());
        queueTest.dequeue();
        assertEquals(7,queueTest.peek());
    }

}
