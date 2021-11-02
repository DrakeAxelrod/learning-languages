
interface Deque<Item> extends Stack<Item>, Queue<Item> {

    void addFirst(Item x);
    default void push(Item x) {
        addFirst(x);
    }

    void addLast(Item x);
    default void enqueue(Item x) {
        addLast(x);
    }

    Item removeFirst();
    default Item pop() {
        return removeFirst();
    }
    default Item dequeue() {
        return removeFirst();
    }

    Item removeLast();

    Item getFirst();
    default Item peek() {
        return getFirst();
    }

    Item getLast();

    // from Stack: push(x), pop(), peek()
    // from Queue: enqueue(x), dequeue(), peek()
    // from Collection: isEmpty(), size()
    // from Iterable: iterator()
}
