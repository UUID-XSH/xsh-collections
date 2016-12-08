package info.xsh.java.collections;

import org.junit.Test;

/**
 * Created by xiaohuo on 16/12/8.
 */
public class XshLinkedListTest {
    @Test
    public void addTest() {
        XshList<String> list = new XshLinkedList<>();
        list.addLast("one");
        list.addLast("two");
        list.addLast("three");
    }
}
