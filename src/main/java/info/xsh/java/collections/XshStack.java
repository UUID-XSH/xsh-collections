package info.xsh.java.collections;


/**
 * Created by xiaohuo on 16/12/8.
 */
public class XshStack<Item> {
    private XshList<Item> items;

    public XshStack() {
        items = new XshLinkedList<>();
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

    public static void main(String[] args) {
        XshStack<String> xshStack = new XshStack<>();
        xshStack.push("one");
        xshStack.push("two");
        xshStack.push("three");
        System.out.println(xshStack.pop());
        System.out.println(xshStack.pop());
        System.out.println(xshStack.pop());

    }

}
