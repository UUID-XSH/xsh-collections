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

    public static void main(String[] args) {
        Queue<String> queue = new Queue<>();
        queue.enqueue("one");
        queue.enqueue("two");
        queue.enqueue("three");
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }
}
