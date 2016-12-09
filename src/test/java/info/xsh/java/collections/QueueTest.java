package info.xsh.java.collections;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by xiaohuo on 16/12/9.
 */
public class QueueTest {
    Queue<String> queue;

    @Before
    public void setup() {
        queue = new Queue<>();
    }

    @Test
    public void enqueue() {
        queue.enqueue("one");
        queue.enqueue("two");
        queue.enqueue("three");
        Assert.assertTrue("one".equals(queue.dequeue()));
        Assert.assertTrue("two".equals(queue.dequeue()));
        Assert.assertTrue("three".equals(queue.dequeue()));
    }
}
