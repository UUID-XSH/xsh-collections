package info.xsh.java.collections;

/**
 * Created by xiaohuo on 16/12/8.
 */
public class XshQueue<Item> {
    private XshList<Item> items;

    public XshQueue() {
        items = new XshLinkedList<>();
    }

    public void enqueue(Item item) {
        items.add(item);
    }

    public Item dequeue() {
        return items.removeLast();
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public int size() {
        return items.size();
    }

    public static void main(String[] args) {
        XshQueue<String> xshQueue = new XshQueue<>();
        xshQueue.enqueue("one");
        xshQueue.enqueue("two");
        xshQueue.enqueue("three");
        System.out.println(xshQueue.dequeue());
        System.out.println(xshQueue.dequeue());
        System.out.println(xshQueue.dequeue());
    }
}
