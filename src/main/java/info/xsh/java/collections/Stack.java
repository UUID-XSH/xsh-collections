package info.xsh.java.collections;


/**
 * Created by xiaohuo on 16/12/8.
 */
public class Stack<Item> {
    private List<Item> items;

    public Stack() {
        items = new LinkedList<>();
    }

    public void push(Item item) {
        items.add(item);
    }

    public Item pop() {
        return items.remove();
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public Item peek() {
        return items.peek();
    }

}
