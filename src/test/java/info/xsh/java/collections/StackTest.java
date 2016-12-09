package info.xsh.java.collections;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by xiaohuo on 16/12/9.
 */
public class StackTest {
    Stack<String> stack;

    @Before
    public void setup() {
        stack = new Stack<>();
    }

    @Test
    public void push() {
        stack.push("one");
        stack.push("two");
        stack.push("three");
        Assert.assertTrue("three".equals(stack.pop()));
        Assert.assertTrue("two".equals(stack.pop()));
        Assert.assertTrue("one".equals(stack.pop()));
    }

}
