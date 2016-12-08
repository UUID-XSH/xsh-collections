package info.xsh.java.collections;

/**
 * Created by xiaohuo on 16/12/6.
 */
public class LinkedList<T> implements List<T> {

    private Node<T> first;
    private Node<T> last;
    private int length;

    @Override
    public void addFirst(T t) {
        Node<T> node = new Node<>(t);
        if (first == null) {
            last = node;
            node.next = null;
        } else {
            first.previous = node;
            node.next = first;
        }
        first = node;
        length++;
    }

    @Override
    public void addLast(T t) {
        Node<T> node = new Node<>(t);
        if (last == null) {
            first = node;
            node.previous = null;
        } else {
            last.next = node;
            node.previous = last;
        }
        last = node;
        length++;
    }

    @Override
    public T removeFirst() {
        if (isEmpty()) {
            throw new RuntimeException("list is empty");
        }
        T t = first.getItem();
        if (first.next == null)
            last = null;
        first = first.next;
        length--;
        return t;
    }

    @Override
    public T removeLast() {
        if (isEmpty()) {
            throw new RuntimeException("list is empty");
        }

        T t = last.getItem();
        if (last.previous == null)
            first = null;
        last = last.previous;
        length--;
        return t;
    }


    @Override
    public void add(T t) {
        this.addFirst(t);
    }

    @Override
    public T remove() {
        return this.removeFirst();
    }

    @Override public T peek() {
        return first == null ? null : first.getItem();
    }

    @Override
    public int size() {
        return length;
    }

    @Override
    public boolean isEmpty() {
        return length == 0;
    }

    private class Node<Item> {
        Item item;
        Node<Item> next;
        Node<Item> previous;

        Node() {

        }

        Node(Item item) {
            this.item = item;
        }

        public Item getItem() {
            return item;
        }

        public void setItem(Item item) {
            this.item = item;
        }
    }


    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.addLast("one");
        list.addLast("two");
        list.addLast("three");
        System.out.println(list.length);
        System.out.println(list.remove());
        System.out.println(list.remove());
        System.out.println(list.remove());
        System.out.println("--------------------");
        list.add("one");
        list.add("two");
        list.add("three");
        System.out.println(list.length);
        System.out.println(list.removeLast());
        System.out.println(list.removeLast());
        System.out.println(list.removeLast());



    }

}
