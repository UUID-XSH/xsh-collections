package info.xsh.java.collections;

/**
 * Created by xiaohuo on 16/12/8.
 */
public class Queue<Item> {
    private List<Item> items;

    public Queue() {
        items = new LinkedList<>();
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

}
