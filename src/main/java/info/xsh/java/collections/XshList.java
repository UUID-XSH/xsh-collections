package info.xsh.java.collections;

/**
 * Created by xiaohuo on 16/12/6.
 */
public interface XshList<Item> {
    void addFirst(Item item);
    void addLast(Item item);
    Item removeFirst();
    Item removeLast();
    void add(Item item);
    Item remove();
    Item peek();
    int size();
    boolean isEmpty();

}
