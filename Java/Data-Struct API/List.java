
interface List<Item> extends Deque<Item> {

    void add(int i, Item x);

    Item get(int i);

    Item set(int i, Item x);

    Item remove(int i);

    default void addFirst(Item x) {
        add(0, x);
    }

    default void addLast(Item x) {
        add(size(), x);
    }

    default Item removeFirst() {
        return remove(0);
    }

    default Item removeLast() {
        return remove(size() - 1);
    }

    default Item getFirst() {
        return get(0);
    }

    default Item getLast() {
        return get(size() - 1);
    }

    // from Deque: addFirst(x), addLast(x), removeFirst(), removeLast(), getFirst(), getLast()
    // from Stack: push(x), pop(), peek()
    // from Queue: enqueue(x), dequeue(), peek()
    // from Collection: isEmpty(), size()
    // from Iterable: iterator()
}

